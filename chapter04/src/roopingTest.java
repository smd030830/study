import java.math.*;
import java.util.*;

public class roopingTest {
    //    과제3
//- p140 의 4장 확인문제 1~7번까지 직접 소스 코딩하세요.
//    인텔리제이에서 Chapter04 프로젝트를 만들고 원하는 클래스를 만들고 해답을 찾으세요
//	2번은 p125 공부하고 소스 코딩하세요.
//	3번은 p128 공부하고 소스 코딩하세요.
//	4번은 p118, p131 공부하고 소스 코딩하세요.
//	5번은 p129 구구단 중첩 for 공부하고 소스 코딩하세요.
//	6번은 중첩 for 공부하고 소스 코딩하세요.
//	7번은 p133 공부하고 소스 코딩하세요.
//-
//- 확인문제3을 wihle 을 이용해서 소스코딩하고 그리고 do while 을 이용하여서 소스 코딩을 하세요
//- 확인문제4를 for 를 이용해서 소크코딩하고, do~while 을 이용해서 소스 코딩하세요
//- 확인문제5를 중첩 while 을 이용해서 소스코딩 하고, 그리고 중첩 do while 을 이용해서 소스코딩 하세요
//- 확인문제6을 wihle 을 이용해서 소스코딩하고 그리고 do while 을 이용하여서 소스 코딩을 하세요
    public void roopingTest2() {
        String grade = "B";
        int score1 = 0;
        if (grade.equals("A")) {
            score1 = 100;
        } else if (grade.equals("B")) {
            score1 = 100 - 20;
        } else {
            score1 = 60;
        }
        System.out.println("점수 : " + score1);
    }

    public void roopingTest3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public void roopingTest3_1() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
    public void roopingTest3_2() {
        int sum = 0;
        int i = 1;

        do {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println(sum);
    }


    public void roopingTest4() {
        int dice1, dice2;
        dice1 = (int) (Math.random() * 10);
        dice2 = (int) (Math.random() * 10);
        while ((dice1 + dice2) != 5) {
            dice1 = (int) (Math.random() * 10);
            dice2 = (int) (Math.random() * 10);
        }
        System.out.println("주사위 눈:" + dice1 + "," + dice2);
    }
    public void roopingTest4_1() {
        int dice1, dice2;
        for (; ; ) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            System.out.println("(" + dice1 + ", " + dice2 + ")");

            if ((dice1 + dice2) == 5) {
                break;
            }
        }
        System.out.println("주사위 눈: " + dice1 + "," + dice2);
    }
    public void roopingTest4_2() {
        int dice1, dice2;

        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + dice1 + ", " + dice2 + ")");
        } while ((dice1 + dice2) != 5);
        System.out.println("주사위 눈: " + dice1 + "," + dice2);
    }

    public void roopingTest5() {
        int x = 1;
        while (x <= 10) {
            int y = 1;
            while (y <= 10) {
                if (4 * x + 5 * y == 60) {
                    System.out.println(x + "," + y);
                }
                y++;
            }
            x++;
        }
    }

    public void roopingTest5_1() {
        int x = 1;
        do {
            int y = 1;
            do {
                if (4 * x + 5 * y == 60) {
                    System.out.println(x + "," + y);
                }
                y++;
            } while (y <= 10);
            x++;
        } while (x <= 10);
    }

    public void roopingTest6() {
        for (int x = 1; x <= 5; x++) {
            for (int y = 0; y < x; y++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void roopingTest6_1() {
        int x = 1;
        do {
            int y = 0;
            do {
                System.out.printf("*");
                y++;
            } while (y < x);

            System.out.println();
            x++;
        } while (x <= 5);
    }
    public void roopingTest7() {
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔고를 저장할 변수
        boolean run = true; // 루프 실행 여부

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sc.nextLine();
                switch (num) {
                    case 1:
                        System.out.print("예금액> ");
                        sc.nextLine();
                        break;

                    case 2:
                        System.out.print("출금액> ");
                        sc.nextLine();
                        break;

                    case 3:
                        System.out.println("잔고> ");
                        sc.nextLine();
                        break;
                    default:
                        run = false;
                        break;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}


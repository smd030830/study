public class arrayTest {
    public void arrayTest1() {
    /* 1번 : 10개의 boolean 값이 원소인 1차원 배열의 짝수번째 인덱스가 true 이고 다른 인덱스는 false 로 만들어서 출력하세요
    입력 =>
    boolean[] boolArray = new boolean[10];
    처리 => 반복문을 사용하세요, 짝수번째 인덱스의 원소를 true, 홀수는 false 로 할당
    한줄에 출력 => true, false, true, false, ..., true, false

    - 1-1 : 30개의 int 형 배열을 선언하고 모든 원소의 값을 인덱스 번호로 대입하세요.
    - 1-2 : char 형 1차원배열을 선언하고 길이는 20개 입니다.
    - 1-3 : boolean 형 2차원 배열을 3행 4열 만들고 값을 true로 모두 설정하세요.
    - 1-4 : String 형 1차원 배열을 선언하고 길이는 50개 입니다. 모든 원소를 "empty" 로 설정하세요.*/
        boolean[] boolArray = new boolean[10];
        for (int i = 0; i < boolArray.length; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
            } else {
                boolArray[i] = false;
            }
        }
        // 출력
        for (int i = 0; i < boolArray.length; i++) {
            System.out.print(boolArray[i] + (i == boolArray.length - 1 ? "" : ", "));
        }
        System.out.println();
        //30개 int 배열 인덱스
        int[] intArr = new int[30];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        //20개 char 배열
        char[] charArr = new char[20];

        //3행 4열 boolean 2차원 배열
        boolean[][] boolArr2D = new boolean[3][4];
        for (int i = 0; i < boolArr2D.length; i++) {
            for (int j = 0; j < boolArr2D[i].length; j++) {
                boolArr2D[i][j] = true;
            }
        }
        //50개 String 배열 empty
        String[] strArr = new String[50];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "empty";
        }
    }

    public void arrayTest2() {
        /*- 2번 : 0,1 로 이루어진 2차원 직사각형 배열이 있습니다. 0의 갯수와 1의 갯수를 출력하세요
    입력 =>
    int[][] intDemention2 = {
            {0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}
            , {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}
            , {1, 0, 0, 0, 1, 0}
    };
    처리 => 반복문을 사용하세요
    한줄에 출력 =>
            0의 갯수는 ?개, 1의 갯수는 ?개.
*/
        int[][] intDemention2 = {
//                    {0, 0, 1, 1, 0, 0},
//                    {1, 0, 0, 1, 0, 0},
//                    {0, 1, 0, 1, 0, 0},
//                    {0, 0, 1, 1, 0, 1},
//                    {1, 0, 0, 0, 1, 0}
                {0, 0, 1, 1, 0, 0}
                , {1, 0, 0, 1, 0, 0}
                , {0, 1, 0, 1, 0, 0}
                , {0, 0, 1, 1, 0, 1}
                , {1, 0, 0, 0, 1, 0}
        };

        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < intDemention2.length; i++) {
            for (int j = 0; j < intDemention2[i].length; j++) {
                if (intDemention2[i][j] == 0) {
                    count0++;
                } else if (intDemention2[i][j] == 1) {
                    count1++;
                }
            }
        }
        System.out.println("0의 갯수는 " + count0 + "개, 1의 갯수는 " + count1 + "개.");
    }

    public void arrayTest3() {

        /*- 3번 : 입력이 아래와 같을때 출력을 아래와 같이 만드세요
    입력 =>
    char[][] chInput = {
            {'*', '*', '*', '*', ' '},
            {'*', '*', ' ', ' ', ' '},
            {'*', ' ', '*', '*', '*'}
    };
    ****
    **
    * ***
    처리 => 반복문 사용하세요
    출력 배열 =>
    char[][] chOutput = {
            {'*', '*', '*'},
            {'*', '*', ' '},
            {'*', ' ', '*'},
            {'*', ' ', '*'},
            {' ', ' ', '*'},
    };
	***
	**
    * *
    * *
      *
*/
        char[][] chInput = {
//                {'*', '*', '*', '*', ' '},
//                {'*', '*', ' ', ' ', ' '},
//                {'*', ' ', '*', '*', '*'}
                {'*', ' ', '*', '*', ' '}
                , {'*', '*', ' ', ' ', ' '}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', '*', '*', ' ', '*'}
                , {'*', ' ', '*', ' ', '*'}
                , {' ', ' ', '*', '*', '*'}
        };
//        for (int i = 0; i < chInput.length; i++) {
//            for (int j = 0; j < chInput[i].length; j++) {
//                System.out.print(chInput[i][j]);
//            }
//            System.out.println();
//        }
        //출력용 배열
        char[][] chOutput = new char[5][6];
        for (int i = 0; i < chInput.length; i++) {
            for (int j = 0; j < chInput[i].length; j++) {
                chOutput[j][i] = chInput[i][j];
            }
        }
        System.out.println(); // 구분선
        for (int i = 0; i < chOutput.length; i++) {
            for (int j = 0; j < chOutput[i].length; j++) {
                System.out.print(chOutput[i][j]);
            }
            System.out.println();
        }
    }

    double[] dArray = new double[25];

    public void arrayTest4_1() {
         /*1차원 배열 double[] dArray 갯수 25개 배열을 생성한다.
		이 배열의 원소에는 난수 0.000 ~ 99.99999 값 25개 가 저장되도록 한다.*/
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = Math.random() * 100;
        }
    }

    public void arrayTest4_2() {
        /*1차원 배열 int[] nArray 갯수 25개 배열을 생성한다.
		이 배열의 원소는 dArray 배열원소에서 소숫점빼고 정수 부분만 저장한다.
		전체 원소들의 합과 평균을 구해서 출력해보자*/
        int[] nArray = new int[25];
        int sum = 0;

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = (int) dArray[i];
            sum += nArray[i];
        }

        double avg = (double) sum / nArray.length;
        System.out.println("합계: " + sum + ", 평균: " + avg);
    }

    public void arrayTest4_3() {
        /*1차원 배열 String[] strArray 갯수 25개 배열을 생성한다.
		이 배열의 원소는 dArray원소의 값 => nArray원소의 값을 문자열로 합쳐서 저장한다.
		예 : "0.983723 => 0", "76.56734005613602345 => 76"
		strArray 배열 원소 25를 출력해보자*/
        String[] strArray = new String[25];
        int[] nArray = new int[25];
        for (int i = 0; i < 25; i++) nArray[i] = (int) dArray[i];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = dArray[i] + " => " + nArray[i];
            System.out.println(strArray[i]);
        }
    }

    public void arryTest4_4(int number) {
        /*입력 => 숫자를 입력 받는다. 예를 들어 number 가 3이다.
    		2차원 배열 int[][] nArray = new int[number][number]; 배열을 생성한다.
		for 문을 이용하여서 원소에는 출력과 같이 되도록 숫자를 각 원소에 대입한다.
		출력 =>
		1, 2, 3
		2, 3, 4
		3, 4, 5
		예를들어서 number 가 7이면
		출력 =>
		1, 2, 3, 4, 5, 6, 7
		2, 3, 4, 5, 6, 7, 8
		3, 4, 5, 6, 7, 8, 9
		4, 5, 6, 7, 8, 9, 10
		5, 6, 7, 8, 9, 10, 11
		6, 7, 8, 9, 10, 11, 12
		7, 8, 9, 10, 11, 12, 13*/
        int[][] nArray = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                nArray[i][j] = i + j + 1;
                System.out.print(nArray[i][j] + (j == number - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }

    public void arrayTest4_5(int number) {
        /*입력 => 숫자를 입력 받는다. 예를 들어 number 가 3이다.
		2차원 배열 char[][] square = new char[number][number];
		for 문을 이용하여 출력처럼 데이터(한글 'ㅂ' 누르고 '한자'키를 누른다)를 대입해서 출력한다.
		출력 =>
		3행 3열
		┌─┐
		│ │
		└─┘
		예를 들어 입력이 7이면
    출력 =>
		7행 7열
		┌─────┐
		│     │
		│     │
		│     │
		│     │
		│     │
		└─────┘*/
        char[][] square = new char[number][number];
        System.out.println(number + "행 " + number + "열");

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j == 0) square[i][j] = '┌';
                else if (i == 0 && j == number - 1) square[i][j] = '┐';
                else if (i == number - 1 && j == 0) square[i][j] = '└';
                else if (i == number - 1 && j == number - 1) square[i][j] = '┘';
                else if (i == 0 || i == number - 1) square[i][j] = '─';
                else if (j == 0 || j == number - 1) square[i][j] = '│';
                else square[i][j] = ' ';
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }

    public void arrayTest4_6(int size) {
        /*2차원 배열 char[][] chDiamond = new char[5][5]; 정방형만 가능
		이 배열이 아래와 같이 출력되도록 값'*'을 for 문으로 직접 만들어서 for 문으로 출력한다.
		출력예제:
          *
         ***
        *****
         ***
          *

           *
          ***
         *****
        *******
         *****
          ***
           *   */
        char[][] chDiamond = new char[size][size];
        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Math.abs(mid - i) + Math.abs(mid - j) <= mid) {
                    chDiamond[i][j] = '*';
                } else {
                    chDiamond[i][j] = ' ';
                }
                System.out.print(chDiamond[i][j]);
            }
            System.out.println();
        }
    }
}

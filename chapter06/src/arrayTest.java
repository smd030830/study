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
    public void arrayTest4() {
        /*
        */
    }
}

public class chapter05 {
    public void exam5_1() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }

    public void exam5_2() {
        int[] intArray = null;
        //intArray[0]= 10;

        String str = null;
        //System.out.println("총 문자 수" +str.length());
    }

    public void exam5_3() {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }

    public void exam5_4() {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("참조 같음");
        } else {
            System.out.println("참조 다름");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        if (strVar3 == strVar4) {
            System.out.println("참조같음");
        } else {
            System.out.println("참조다름");
        }
        if (strVar3.equals(strVar4)) {
            System.out.println("문자열 같음");
        }
    }

    public void exam5_5() {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }

    public void exam5_6() {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }
    public void exam5_7() {
        String ssn = "9506241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        }else
            System.out.println("주민등록번호 자릿수가 다릅니다");
    }
    public void exam5_8() {
        String oldStr = "자바 문자열은 불변입니다. 자바 분자열은 String";
        String newStr = oldStr.replace("자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
    public void exam5_9() {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
    public void exam6_10() {
        String subject ="자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책");
        }else{
            System.out.println("자바와 관련 없는 책");
        }
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자봥 관련된 책");
        }else {
            System.out.println("자바와 관련 없는 책");
        }
    }
    public void exam6_11() {
        String board = "1,자바 학습, 참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호: "+tokens[0]);
        System.out.println("제목: "+tokens[1]);
        System.out.println("내용: "+tokens[2]);
        System.out.println("성명: "+tokens[3]);
        System.out.println();

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}

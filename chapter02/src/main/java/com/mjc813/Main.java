package com.mjc813;

import com.sun.jdi.FloatType;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
            // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
            System.out.println("i = " + i);
        }
        Variable01 varObj = new Variable01();

        IntegerType intType = new IntegerType();
        CharType charType = new CharType();
        FDType floatType = new FDType();
        BooleanType boolType = new BooleanType();
        StringType stringType = new StringType();

        // howToUseVariable 메소드 호출
        varObj.howToUseVariable();
        intType.usiInteger();
        charType.useChar();
        floatType.useFloatDouble();
        boolType.useBoolean();
        stringType.usingString();
    }
}
//
//과제2
//교재 2-2 정수타입의 예제를 IntegerType 클래스의 useInteger() 멤버 메소드에 구현하고 main 에서 실행하세요
//교재 2-3 문자타입의 예제를 CharType 클래스의 useChar() 멤버 메소드에 구현하고 main 에서 실행하세요.
//교재 2-4 실수타입의 예제를 FDType 클래스의 useFloatDouble() 멤버 메소드에 구현하고 main 에서 실행하세요.
//교재 2-5 논리타입의 예제를 BooleanType 클래스의 useBoolean() 멤버 메소드에 구현하고 main 에서 실행하세요.
//교재 2-6 문자열타입의 예제를 StringType 클래스의 useString() 멤버 메소드에 구현하고 main 에서 실행하세요.
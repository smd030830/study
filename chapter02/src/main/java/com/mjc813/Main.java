package com.mjc813;

import com.sun.jdi.FloatType;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        /*System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
            // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
            System.out.println("i = " + i);
        }*/
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

        //0116 오전 과제
        trancelateType trancelateType = new trancelateType();
        trancelateType.useTranslate();
        trancelateType.useTranslate2();
    }
}
package com.mjc813;

public class main2 {
    public static void main(String[] args) {
        checktest.Printer printer = new checktest.Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");

        System.out.println("--- 객체 생성 없이(static) 호출 ---");
        checktest.Printer.staticPrintln(10);
        checktest.Printer.staticPrintln(true);
        checktest.Printer.staticPrintln(5.7);
        checktest.Printer.staticPrintln("홍길동");

        System.out.println("--- 로그인 테스트 ---");
        checktest.MemberService memberService = new checktest.MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
        System.out.println("--- 싱글톤 테스트 ---");
        checktest.ShopService obj1 = checktest.ShopService.getInstance();
        checktest.ShopService obj2 = checktest.ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}

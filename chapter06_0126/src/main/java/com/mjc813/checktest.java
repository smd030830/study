package com.mjc813;

public class checktest {
    static class MemberService {
        String name;
        String id;
        String password;
        int age;

        public MemberService(String name, String id, String password, int age) {
            this.name = name;
            this.id = id;
            this.password = password;
            this.age = age;
        }

        public MemberService() {
            this.id = "hong";
            this.password = "12345";
        }

        public boolean login(String id, String password) {
            if ("hong".equals(id) && "12345".equals(password)) {
                return true;
            }
            return false;
        }

        public void logout(String id) {
            System.out.println(id + "님이 로그아웃 되었습니다.");
        }
    }

    static class Printer {
        // 인스턴스 메소드
        public void println(int value) { System.out.println(value); }
        public void println(boolean value) { System.out.println(value); }
        public void println(double value) { System.out.println(value); }
        public void println(String value) { System.out.println(value); }

        // 정적 메소드
        public static void staticPrintln(int value) { System.out.println(value); }
        public static void staticPrintln(boolean value) { System.out.println(value); }
        public static void staticPrintln(double value) { System.out.println(value); }
        public static void staticPrintln(String value) { System.out.println(value); }
    }

    //싱글톤 패턴
    static class ShopService {
        private static ShopService singleton = new ShopService();
        private ShopService() {}
        public static ShopService getInstance() {
            return singleton;
        }
    }

}
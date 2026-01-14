public class ThisJava {
    public static void main(String[] args) {
        // 과제 1
        System.out.println("과제 1");
        System.out.println("This is Java !");
        System.out.println();

        // 과제 2
        System.out.println("과제 2");
        String version = System.getProperty("java.specification.version");
        System.out.println("My Java version = " + version + ".");
        System.out.println();

        System.out.println("과제 3");

        for (int group = 2; group <= 8; group += 3) {

            if (group == 2) System.out.println("2단 출력       3단 출력       4단 출력");
            else if (group == 5) System.out.println("5단 출력       6단 출력       7단 출력");
            else if (group == 8) System.out.println("8단 출력       9단 출력");

            for (int i = 1; i <= 9; i++) {
                String line = "";
                for (int dan = group; dan < group + 3 && dan <= 9; dan++) {
                    int result = dan * i;

                    String resultStr = (result < 10) ? result + " " : String.valueOf(result);

                    line += dan + " * " + i + " = " + resultStr + "    ";
                }
                System.out.println(line);
            }
            System.out.println();
        }
    }
}
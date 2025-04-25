public class Scanner {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("이름 입력:");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("나이 입력 :");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.print("키 입력 :");
        double height = scanner.nextDouble();
        System.out.println(height + "cm");

        System.out.print("기분 좋음?");
        boolean emotion = scanner.nextBoolean();
        System.out.println(emotion);

        scanner.close();
    }
}

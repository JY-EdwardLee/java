package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = scanner.nextLine(); // 입력을 String으로
        System.out.println(str);

        System.out.println("정수 ㅁ입력");
        int number = scanner.nextInt();
        System.out.println(number);

        System.out.println("살수 입력");
        double number2 = scanner.nextDouble();
        System.out.println(number2);
    }
}
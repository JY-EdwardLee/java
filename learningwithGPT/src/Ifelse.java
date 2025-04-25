import java.util.Arrays;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = myScanner.nextLine();
        int age = myScanner.nextInt();

        if (age > 20) {
            System.out.printf("%s은 성인입니다.", name);
        } else {
            System.out.printf("%s는 미성년자입니다.", name);
        }
    }
}

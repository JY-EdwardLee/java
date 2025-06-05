package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        change(num1);
        System.out.println(num1);
    }
    public static void change(int num2) {
        System.out.println(num2);
        num2 = num2 * 2;
        System.out.println(num2);
    }
}

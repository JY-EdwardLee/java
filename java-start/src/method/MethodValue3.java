package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        num1 = changenum(num1);
        System.out.println(num1);
    }
    public static int changenum(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}

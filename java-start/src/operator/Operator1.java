package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 9, b = 5;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        // int 형 끼리 변환은 소숫점 표현이 안된다.
        int div = a / b;
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}

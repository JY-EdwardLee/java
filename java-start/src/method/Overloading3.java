package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.2, 1.4));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}

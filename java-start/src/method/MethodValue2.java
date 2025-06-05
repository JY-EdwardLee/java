package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);
        changenum(number);
        System.out.println(number);
    }
    public static void changenum(int number) {
        System.out.println(number);
        number++;
        System.out.println(number);
    }
}

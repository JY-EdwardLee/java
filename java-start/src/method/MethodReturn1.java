package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        System.out.println(odd(1));
    }

    public static boolean odd(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

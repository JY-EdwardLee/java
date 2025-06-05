package operator;

public class Comp2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        boolean result1 = s1.equals(s2);
        System.out.println(result1);
        boolean result2 = s1.equals(s1);
        System.out.println(result2);

        System.out.println(result1);
    }
}

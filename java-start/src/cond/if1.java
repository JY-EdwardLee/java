package cond;

public class if1 {
    public static void main(String[] args) {
        int age = 19;

        if (age >= 20) {
            System.out.println("adult");
        } else if (age >= 18) {
            System.out.println("child");
        } else {
            System.out.println("not child");
        }
    }
}

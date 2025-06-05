package method;

public class Overloading2 {
    public static void main(String[] args) {
        myMe(1, 2);
        myMe(1, 2.0);
    }
    public static void myMe(int a, int b){
        System.out.println(a+b);
    }
    public static void myMe(int a, double b){
        System.out.println(a+b);
    }
}

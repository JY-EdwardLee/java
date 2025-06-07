package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("start");
        method1(10);
        System.out.println("end");
    }
    static void method1(int n1) {
        System.out.println("method1");
        int cal = n1 + 2;
        method2(cal);
        System.out.println("method1 end");
    }
    static void method2(int n2) {
        System.out.println("method2");
        System.out.println("method2");
    }
}

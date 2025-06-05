package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 1; i < 2 ; i++) {
            System.out.println(i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j" + j);
            }
            System.out.println("jj" + i);
        }
    }
}

package loop;

public class While1_3 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int endnum = 100;
        while (i <= endnum) {
            count = count + i;
            i++;
            }
        System.out.println(i + " " + count);
    }
}
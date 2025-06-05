package casting;

public class casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 214748368L;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) maxIntOver;
        System.out.println(intValue);
    }
}

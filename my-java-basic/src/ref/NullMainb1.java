package ref;

public class NullMainb1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data);
        data = new Data();
        System.out.println(data);
        data = null;
        System.out.println(data);
    }
}

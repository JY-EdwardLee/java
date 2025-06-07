package ref;

public class VarChage2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA.value);
        System.out.println(dataB.value);

        // a 변경
        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        // b 변경
        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
}

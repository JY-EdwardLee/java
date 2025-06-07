package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA =new Data();
        dataA.value = 10;
        System.out.println(dataA.value);
        changeValue(dataA);
        System.out.println(dataA.value);
    }

    static void changeValue(Data dataX){
        dataX.value = 20;
    }
}

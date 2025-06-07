package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        System.out.println(valueData.value);
        valueData.add();
        System.out.println(valueData.value);

    }
    static void add(ValueData value){
        value.value++;
    }
}

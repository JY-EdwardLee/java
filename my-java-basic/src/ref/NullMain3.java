package ref;

import java.sql.SQLOutput;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.count);
        System.out.println(bigData.data);

        //NullPointerException
        System.out.println(bigData.data.value); // data가 null인데 .을 찍어버렸다.
    }
}

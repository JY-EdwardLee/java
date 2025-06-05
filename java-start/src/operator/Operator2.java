package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기 1
        String result1 = "hello" + "world";
        System.out.println(result1);

        // 더하기 2
        String s1 = "Hello";
        String s2 = "World";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 (자동 형변환)
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}

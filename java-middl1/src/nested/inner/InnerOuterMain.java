package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // 이 녀석을 먼저 생성을하고
        InnerOuter.Inner inner = outer.new Inner(); // outer.new 내부클래스() 형식이 필요함
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}

package nested;

public class ShdowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value); // this는 나의 인스턴스의
            System.out.println("ShdowingMain.value = " + ShdowingMain.this.value); //바깥 클래스이름.this.는 바깥 클래스의 인스턴스
        }
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}

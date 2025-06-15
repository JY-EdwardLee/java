package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3; // 인스턴스 변수 3

    // 인스턴스 메서드
    public void process(int paramVar) {

        int localVar = 1;

        // 지역 클래스(process 코드 블럭 안에 선언됨)
        class LocalPrinter {
            int value = 0; // 지역변수 선언 가능

            // 내부 클래스의 종류 중 하나라 똑같이 다 접근 가능
            public void printData() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}

package exception.basic.checked;
/*
* 예외를 처리하지 않고 던지기만 하는
* */
public class CheckedThrowMain {
    // 결국 콘솔창에 까지 던져짐
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow(); // option + Enter치면 throws 처리해줌
        System.out.println("정상 종료");
    }
}

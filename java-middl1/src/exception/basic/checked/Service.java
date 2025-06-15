package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    // 만일 catch에서 MyCheckedException을 못잡으면 던져줘야함
    public void callCatch(){
        try {
            // Client에서 throws로 던져져서 여기로 옴
            client.call();
        }
        // 에러가 터진 것을 여기서 잡음 catch로 오면 처리된거라고 생각하면 됨
        // catch (Exception e) { 부모니까 잡을 수 있음
        // catch (RuntimeException e) { 못잡음 위에서 던져줘야함
        catch (MyCheckedException e) {
            //예외 처리 로직 (불 끄기)
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckedException {
        client.call();
    }

}

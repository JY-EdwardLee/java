package exception.basic.checked;

public class Client {
    // 이 쪽에 아래서 발생 시킨 에러를 throws를 통해 던질 때 쓰는 것
    // 체크 예외는 개발자가 반드시 처리해줘야 한다.
    public void call() throws MyCheckedException {
        // 문제 상황 예외를 발생시킬 때 땐, throw를 써라.
        // MyCheckedException ex = new MyCheckedException("ex");
        throw new MyCheckedException("ex");
        // 이 밑으로 진행이 안됨
    }
}

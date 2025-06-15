package exception.basic.unchecked;

public class Client {
    // 알아서 나간다. throws 불필요
    public void call() {
        throw new MyUncheckedException("ex");
    }
}

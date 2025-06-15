package exception.ex2;
/*
Exception 처리를 위한 파일을 따로 생성할 수 있다.
Exception 이라는 부모 클래스를 상속
에러코드를 인스턴슬로 생성하고, 에러코드 반환 메서드와
*/
public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

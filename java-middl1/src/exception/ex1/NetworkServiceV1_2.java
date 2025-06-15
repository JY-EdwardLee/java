package exception.ex1;
/*
한계:
자바 내부는 가바지 컬렉션을 하겠지만,
자바 외부의 자원은 사용 후에 연결을 해제해서 반드시 외부 자원 해체해야함.
*/
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        String connectResult = client.connect(); // 리턴값으로 오류명을 받기
//        if (!connectResult.equals("success")) { <- control + T => method 검색
        if (isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect();
    }
    // 결과가 성공인지를 체크하는 스태틱 메서드 생성
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}

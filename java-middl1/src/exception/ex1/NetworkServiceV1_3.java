package exception.ex1;
/*
정상 흐름과 예외 흐름이 섞여 있음, 실무에서는 반드시 분리해줘야 한다.
*/
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        String connectResult = client.connect();
        if (isError(connectResult)) { //오류가 발생 했을 때,
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) { //오류가 발생했을 때
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        // 윗 단계에 return이 없어서 항상 연결을 끊어 줌(연결을 실패하더라도)
        // 항상 diconnect처리를 해줌
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}

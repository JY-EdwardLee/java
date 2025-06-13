package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // NetworkMessage를 따로 뺄 필요가 없이 그냥 중첩해서 쓰면 캡슐화에 유리
    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}

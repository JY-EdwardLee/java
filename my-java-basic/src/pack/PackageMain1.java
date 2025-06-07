package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User(); // 다른 패키지는 경로와 함께 호출
    }
}

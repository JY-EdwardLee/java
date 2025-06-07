package access.r;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public
        data.publicField = 1;
        data.publicMethod();
        // default
        data.defaultField = 2;
        data.defaultMethod();
        //private
//        data.privateField = 1; // 에러
//        data.privateMethod(); //에러

        data.innerAccess(); // 안에 private가 있지만 innerAccess자체가 내부에서 호출이라 이용 가능
    }
}

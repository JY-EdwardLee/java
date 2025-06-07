package access.l;

import access.r.AccessData;

public class AccesssOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public
        data.publicField = 1;
        data.publicMethod();
        // default 패키지 달라서 안됨
//        data.defaultField = 2; // 에러
//        data.defaultMethod(); // 에러
        //private
//        data.privateField = 1; // 에러
//        data.privateMethod(); //에러

        data.innerAccess(); // 안에 private가 있지만 innerAccess자체가 내부에서 호출이라 이용 가능
    }
}

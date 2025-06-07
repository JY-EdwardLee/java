package access.l;

//import access.r.DefaultClass1; // 얘도 당근 안됨
import access.r.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default로 된 녀석은 불가능
//        DefaultClass1 class1 = new DefaultClass();
//        DefaultClass2 class2 = new DefaultClass2();

    }
}

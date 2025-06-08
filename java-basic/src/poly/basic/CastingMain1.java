package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        // Child child = (Child) poly; // 자식은 부모를 못 담는다. 대신 다운 캐스팅은 내가 책임진다. 라고 하고 poly에 Child 타입을 넣어버림
        Child child = (Child) poly; //x001
        child.childMethod();
    }
}

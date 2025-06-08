package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, caw, duck}; // Animal 배열에도 다 담을 수 있다.

        //변하지 않는 부분
        for (Animal animal : animalArr) { // Animal 객체 animal이 자식 클래스로 받을 수 있다.. 부모니까
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}

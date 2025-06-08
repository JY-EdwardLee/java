package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.sound();
        //이 녀석을 실제로 사용될 일이 없음, 그냥 다형성을 위해 존재
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

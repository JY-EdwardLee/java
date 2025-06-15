package nested.inner.ex1;

//Car에서만 사용
public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }
    public void start() {
        System.out.println(car.getChargeLevel());
        System.out.println(car.getModel() + "엔진 구동");
    }

}

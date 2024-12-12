package december10th;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.brake();
        car.start();
        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.numberOfWheels);
        System.out.println(car.year);
        System.out.println(car.price);

    }
}

package vehicles;

public class Car extends Transport {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Машина начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Машина прекращает движение");
    }
}

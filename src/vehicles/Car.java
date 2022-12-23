package vehicles;

public class Car extends Transport {

    private int number;

    public Car(String brand, String model, float engineVolume, int number) {
        super(brand, model, engineVolume);
        if (number <= 0) this.number = 1;
        else this.number = number;
    }

    @Override
    public void startMoving() {
        System.out.println("Машина начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Машина прекращает движение");
    }

    @Override
    public String toString() {
        return "машина " + getBrand() + " " + getModel() + ", " +
                "номер: " + number + ", объем двигателя: " + getEngineVolume();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) this.number = 1;
        else this.number = number;
    }
}

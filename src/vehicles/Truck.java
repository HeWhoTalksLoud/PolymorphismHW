package vehicles;

import license.LicenseB;
import license.LicenseC;

public class Truck<T extends LicenseC> extends Transport implements Competing {

    private int number;
    public Truck(String brand, String model, float engineVolume, int number) {
        super(brand, model, engineVolume);

        if (number <= 0) this.number = 1;
        else this.number = number;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик прекращает движение");
    }

    @Override
    public String toString() {
        return "грузовик " + getBrand() + " " + getModel() + ", " +
                "номер: " + number + ", объем двигателя: " + getEngineVolume();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) this.number = 1;
        else this.number = number;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик - пит-стоп");
    }

    @Override
    public void bestLap() {
        System.out.println("Грузовик - лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик - макс. скорость");
    }
} //
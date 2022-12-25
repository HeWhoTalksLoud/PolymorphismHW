package vehicles;

import driver.DriverC;

public class Truck<T extends DriverC> extends Transport  {

    private int number;
    private T driver;
    public Truck(String brand, String model, float engineVolume, int number) {
        super(brand, model, engineVolume);

        if (number <= 0) this.number = 1;
        else this.number = number;

        this.driver = null;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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
    public void showRaceInfo() {
        if (driver == null) {
            System.out.println(getBrand() + " " + getModel() + " " +
                    number + " - водитель не назначен");
        }
        else {
            System.out.println("Водитель " + driver.getName() + " управляет грузовиком: \n" +
                    this + " и будет участвовать в заезде");
        }
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
} ////
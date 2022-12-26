package vehicles;

import driver.Driver;
import driver.DriverB;

public class Car extends Transport<DriverB> {

    private int number;
    //private DriverB driver;

    public Car(String brand, String model, float engineVolume, int number) {
        super(brand, model, engineVolume);

        if (number <= 0) this.number = 1;
        else this.number = number;

        this.driver = null;
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

//    @Override
//    public DriverB getDriver() {
//        return this.driver;
//    }


    @Override
    public void showRaceInfo() {
        if (driver == null) {
            System.out.println(getBrand() + " " + getModel() + " " +
                    number + " - водитель не назначен");
        }
        else {
            System.out.println("Водитель " + driver.getName() + " управляет автомобилем: \n" +
                    this + " и будет участвовать в заезде");
        }
    }

//    public void setDriver(DriverB driver) {
//        this.driver = driver;
//    }


    @Override
    public void pitStop() {
        System.out.println("Машина - пит-стоп");
    }

    @Override
    public void bestLap() {
        System.out.println("Машина - лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Машина - макс. скорость");
    }
} ////

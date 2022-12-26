package vehicles;

import driver.DriverB;
import driver.DriverD;

public class Bus extends Transport<DriverD> {

    private String number;
    //private DriverD driver;
    public Bus(String brand, String model, float engineVolume, String number) {
        super(brand, model, engineVolume);

        if (number == null || number.equals("")) this.number = "default";
        else this.number = number;

        driver = null;
    }



    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус прекращает движение");
    }

    @Override
    public String toString() {
        return "автобус " + getBrand() + " " + getModel() + ", " +
                "номер: " + number + ", объем двигателя: " + getEngineVolume();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null || number.equals("")) this.number = "default";
        else this.number = number;
    }

    @Override
    public void showRaceInfo() {
        if (driver == null) {
            System.out.println(getBrand() + " " + getModel() + " " +
                    number + " - водитель не назначен");
        }
        else {
            System.out.println("Водитель " + driver.getName() + " управляет автобусом: \n" +
                    this + " и будет участвовать в заезде");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус - пит-стоп");
    }

    @Override
    public void bestLap() {
        System.out.println("Автобус - лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус - макс. скорость");
    }
} ////

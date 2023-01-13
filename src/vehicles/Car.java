package vehicles;

import driver.DriverB;
import mechanic.Mechanic;
import mechanic.VehicleType;

public class Car extends Transport<DriverB> {

    private int number;
    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, int number) {
        super(brand, model, engineVolume);

        if (number <= 0) this.number = 1;
        else this.number = number;

        this.driver = null;
        this.bodyType = null;
    }

    @Override
    public void inspection() {
        System.out.println("Автомобиль прошел диагностику");
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

    @Override
    public void assignMechanic(Mechanic mechanic) throws WrongVehicleTypeException {
        if (mechanic.getAvailableVehicleTypes().contains(VehicleType.CAR)) {
            mechanics.add(mechanic);
        } else {
            throw new WrongVehicleTypeException("Механик не имеет доступа к работе с легковыми авто");
        }
    }

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

    @Override
    public void printType() {
        System.out.println(bodyType == null ? "Данных по транспортному средству недостаточно" :
                bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
} //
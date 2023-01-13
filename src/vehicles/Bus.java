package vehicles;

import driver.DriverD;
import mechanic.Mechanic;
import mechanic.VehicleType;

public class Bus extends Transport<DriverD> {

    private String number;
    private PassengerCapacity passengerCapacity;
    public Bus(String brand, String model, float engineVolume, String number) {
        super(brand, model, engineVolume);

        if (number == null || number.equals("")) this.number = "default";
        else this.number = number;

        this.driver = null;
        this.passengerCapacity = null;
    }

    @Override
    public void assignMechanic(Mechanic mechanic) throws WrongVehicleTypeException {
        if (mechanic.getAvailableVehicleTypes().contains(VehicleType.BUS)) {
            mechanics.add(mechanic);
        } else {
            throw new WrongVehicleTypeException("Механик не имеет доступа к работе с автобусами");
        }
    }

    @Override
    public void inspection() throws WrongVehicleTypeException {
        throw new WrongVehicleTypeException("Автобусы не могут проходить диагностику");
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

    @Override
    public void printType() {
        System.out.println(passengerCapacity == null ? "Данных по транспортному средству недостаточно" :
                passengerCapacity);
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
} ////

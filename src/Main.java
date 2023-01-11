import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import mechanic.Mechanic;
import mechanic.VehicleType;
import vehicles.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.4f, 123);
        Car car2 = new Car("BMW", "745i", 2.0f, 18);
        Car car3 = new Car("Mitsubishi", "Space Star", 1.6f, 540);
        Car car4 = new Car("Mitsubishi", "Gallant", 1.8f, 0);

        Bus bus1 = new Bus("Ikarus", "1", 3.0f, "FF12");
        Bus bus2 = new Bus("Otokar", "F", 4.0f, "34TJ");
        Bus bus3 = new Bus("Mercedes", "M", 5.0f, "000");
        Bus bus4 = new Bus("Hyundai", "HJ", 4.5f, "A");

        Truck truck1 = new Truck("Scania", "S", 5.6f, 1);
        Truck truck2 = new Truck("Peterbilt", "LKJ", 6.0f, 69);
        Truck truck3 = new Truck("Renault", "R", 5.9f, 2);
        Truck truck4 = new Truck("Freightliner", "Big", 8.0f, 30);

        List<Transport> transportList = new LinkedList<>();

        transportList.add(car1);
        transportList.add(car2);
        transportList.add(car3);
        transportList.add(car4);

        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(bus3);
        transportList.add(bus4);

        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(truck3);
        transportList.add(truck4);

        transportList.forEach(s -> System.out.println(s));

        /*
        System.out.println(car1); System.out.println(car2);
        System.out.println(car3); System.out.println(car4);

        System.out.println();
        System.out.println(bus1); System.out.println(bus2);
        System.out.println(bus3); System.out.println(bus4);

        System.out.println();
        System.out.println(truck1); System.out.println(truck2);
        System.out.println(truck3); System.out.println(truck4);

        truck3.startMoving();
        truck3.stopMoving();

        bus1.pitStop();
        car3.bestLap();
        truck2.maxSpeed();
*/
        DriverB driver1 = new DriverB("Иванов П. П.", 10);
        DriverC driver2 = new DriverC("Петров И. И.", 15);
        DriverD driver3 = new DriverD("Сидоров А. Б.", 20);

        List<Driver> driversList = new LinkedList<>();

        driversList.add(driver1);
        driversList.add(driver2);
        driversList.add(driver3);

        driversList.forEach(s -> System.out.println(s.getName()));

        Mechanic mechanic1 = new Mechanic("Иван", "Иванов", "АБВ");
        Mechanic mechanic2 = new Mechanic("Дмитрий", "Петров", "АБВ");
        Mechanic mechanic3 = new Mechanic("Петр", "Дмитриев", "АБВ");

        List<Mechanic> mechanicsList = new LinkedList<>();

        mechanicsList.add(mechanic1);
        mechanicsList.add(mechanic2);
        mechanicsList.add(mechanic3);

        mechanic1.addVehicleType(VehicleType.CAR);
        mechanic1.addVehicleType(VehicleType.TRUCK);
        mechanic1.addVehicleType(VehicleType.BUS);

        mechanic2.addVehicleType(VehicleType.TRUCK);

        mechanicsList.forEach(s -> System.out.println(s));

        car3.setDriver(driver1);
        try {
            car3.assignMechanic(mechanic1);
            truck3.assignMechanic(mechanic1);
            truck2.assignMechanic(mechanic2);
        } catch (WrongVehicleTypeException e) {
            System.out.println("Ошибка при попытке назначения механика: " + e.getMessage());
        }

        car3.showMechanics();
        truck2.showMechanics();

        // car3.setDriver(driver2); // - ошибка уже в IDE - нам нужен агрумент типа DriverB
/*        truck3.setDriver(driver2);
        bus1.setDriver(driver3);

        car3.showRaceInfo();
        truck3.showRaceInfo();
        bus1.showRaceInfo();
        bus2.showRaceInfo();

/*        car3.setBodyType(BodyType.SEDAN);
        truck3.setCarryingCapacity(CarryingCapacity.N1);
        bus1.setPassengerCapacity(PassengerCapacity.MEDIUM);

        car3.printType();
        truck3.printType();
        bus1.printType();
        bus2.printType();

        try {
            car3.inspection();
            truck3.inspection();
            bus1.inspection();
        } catch (WrongVehicleTypeException e) {
            System.out.println("Ошибка при попытке прохождения: " + e.getMessage());
        }
*/
    }
} ////
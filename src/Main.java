import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import mechanic.Mechanic;
import mechanic.VehicleType;
import vehicles.*;

import java.util.*;


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

        Map<Transport, Mechanic> mechanics = new HashMap<>();

        mechanics.put(truck1, mechanic2);
        mechanics.put(truck1, mechanic1);
        mechanics.put(car2, mechanic1);
        mechanics.put(bus1, mechanic3);

        for (Map.Entry<Transport, Mechanic> entry : mechanics.entrySet()) {
            System.out.println(entry.getKey() + ", механик: " + entry.getValue());
        }

    }
} ////
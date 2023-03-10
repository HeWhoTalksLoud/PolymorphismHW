import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import vehicles.*;


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

        DriverB driver1 = new DriverB("Иванов П. П.", 10);
        DriverC driver2 = new DriverC("Петров И. И.", 15);
        DriverD driver3 = new DriverD("Сидоров А. Б.", 20);

        car3.setDriver(driver1);
        // car3.setDriver(driver2); // - ошибка уже в IDE - нам нужен агрумент типа DriverB
        truck3.setDriver(driver2);
        bus1.setDriver(driver3);

        car3.showRaceInfo();
        truck3.showRaceInfo();
        bus1.showRaceInfo();
        bus2.showRaceInfo();



    }
} ////
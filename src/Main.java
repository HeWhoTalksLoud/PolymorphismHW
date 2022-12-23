import driver.DriverB;
import driver.DriverC;
import license.LicenseB;
import license.LicenseC;
import license.LicenseD;
import vehicles.*;


public class Main {
    public static void main(String[] args) {
        Car<LicenseB> car1 = new Car<>("Lada", "Granta", 1.4f, 123);
        Car<LicenseB> car2 = new Car<>("BMW", "745i", 2.0f, 18);
        Car<LicenseB> car3 = new Car<>("Mitsubishi", "Space Star", 1.6f, 540);
        Car<LicenseB> car4 = new Car<>("Mitsubishi", "Gallant", 1.8f, 0);

        Bus<LicenseD> bus1 = new Bus<>("Ikarus", "1", 3.0f, "FF12");
        Bus<LicenseD> bus2 = new Bus<>("Otokar", "F", 4.0f, "34TJ");
        Bus<LicenseD> bus3 = new Bus<>("Mercedes", "M", 5.0f, "000");
        Bus<LicenseD> bus4 = new Bus<>("Hyundai", "HJ", 4.5f, "A");

        Truck<LicenseC> truck1 = new Truck<>("Scania", "S", 5.6f, 1);
        Truck<LicenseC> truck2 = new Truck<>("Peterbilt", "LKJ", 6.0f, 69);
        Truck<LicenseC> truck3 = new Truck<>("Renault", "R", 5.9f, 2);
        Truck<LicenseC> truck4 = new Truck<>("Freightliner", "Big", 8.0f, 30);

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

        LicenseB licenseB = new LicenseB();
        LicenseC licenseC = new LicenseC();

        DriverB<LicenseB> driver1 = new DriverB<>("Иванов Петр", licenseB, 20);
        DriverC<LicenseC> driver2 = new DriverC<>("Петров Иван", licenseC, 15);
        driver1.setVehicle(car1);
        driver2.setVehicle(truck3);
        driver1.showRaceInfo();
        driver2.showRaceInfo();
    }
} //
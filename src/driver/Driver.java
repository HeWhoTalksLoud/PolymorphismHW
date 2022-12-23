package driver;

import license.License;
import vehicles.Transport;

public class Driver<T extends  License> {

    private String name;
    private String licenseClass;
    private int yearsOfExp;
    private License license;

    private Transport vehicle;

    public Driver(String name, License license, int yearsOfExp) {
        if (name == null || name.equals("")) this.name = "default";
        else this.name = name;

        /*if (licenseClass != "B" && licenseClass != "C" && licenseClass != "D") {
            this.licenseClass = "B";
        }
        else this.licenseClass = licenseClass;*/

        if (yearsOfExp <=0) this.yearsOfExp = 1;
        else this.yearsOfExp = yearsOfExp;

        this.vehicle = null;
        this.license = null;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Transport getVehicle() {
        return vehicle;
    }

    public void setVehicle(Transport vehicle) {
        this.vehicle = vehicle;
    }

    public void showRaceInfo() {
        if (getVehicle() == null) {
            System.out.println("Автомобиль не назначен");
        }
        System.out.println("Водитель " + name + " управляет автомобилем:\n" + getVehicle() +
                " и будет участвовать в гонке");
    }
}

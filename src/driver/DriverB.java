package driver;

import license.License;
import license.LicenseB;
import vehicles.Car;
import vehicles.Transport;

public class DriverB<T extends LicenseB> extends Driver {
    public DriverB(String name, T license, int yearsOfExp) {
        super(name, license, yearsOfExp);
    }

    //@Override
    public void setVehicle(Car<T> vehicle) {
        super.setVehicle(vehicle);
    }
}

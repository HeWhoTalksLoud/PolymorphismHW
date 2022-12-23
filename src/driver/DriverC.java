package driver;

import license.License;
import license.LicenseC;

public class DriverC<T extends LicenseC> extends Driver {
    public DriverC(String name, T license, int yearsOfExp) {
        super(name, license, yearsOfExp);
    }
}

package driver;

import license.License;
import license.LicenseD;

public class DriverD<T extends LicenseD> extends Driver{
    public DriverD(String name, T license, int yearsOfExp) {
        super(name, license, yearsOfExp);
    }
}

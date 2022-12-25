package driver;

import vehicles.Transport;

public class Driver {

    private String name;
    private int yearsOfExp;

    public Driver(String name, int yearsOfExp) {
        if (name == null || name.equals("")) this.name = "default";
        else this.name = name;

        if (yearsOfExp <=0) this.yearsOfExp = 1;
        else this.yearsOfExp = yearsOfExp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}

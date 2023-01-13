package mechanic;

import vehicles.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mechanic {
    private String firstName;
    private String lastName;
    private String company;
    private Set<VehicleType> availableVehicleTypes = new HashSet<>();
    private Set<Transport> assignedVehicles = new HashSet<>();

    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public Mechanic(String firstName, String lastName, String company,
                    Set<VehicleType> vehicleTypes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.availableVehicleTypes = vehicleTypes;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void addVehicleType(VehicleType vt) {
        availableVehicleTypes.add(vt);
    }

    public void removeVehicleType (VehicleType vt) {
        availableVehicleTypes.remove(vt);
    }

    public Set<VehicleType> getAvailableVehicleTypes() {
        return availableVehicleTypes;
    }

    public void doService(Transport vehicle) {
        if (assignedVehicles.contains(vehicle)) {
            System.out.println("Проводится техобслуживание: " + vehicle.getBrand() +
                    " " + vehicle.getModel());
        }
        else {
            System.out.println("Данное ТС не обслуживается этим механиком");
        }
    }

    public void doRepair(Transport vehicle) {
        if (assignedVehicles.contains(vehicle)) {
            System.out.println("Проводится ремонт: " + vehicle.getBrand() +
                    " " + vehicle.getModel());
        }
        else {
            System.out.println("Данное ТС не обслуживается этим механиком");
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
} ///

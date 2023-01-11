package vehicles;


import mechanic.Mechanic;

import java.util.HashSet;
import java.util.Set;

abstract public class Transport<T> implements Competing {
    private final String brand;
    private final String model;
    private final float engineVolume;

    protected Set<Mechanic> mechanics = new HashSet<>();

    protected T driver;

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.equals("")) this.brand = "default";
        else this.brand = brand;

        if (model == null || model.equals("")) this.model = "default";
        else this.model = model;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;

        this.driver = null;
    }

    public abstract void assignMechanic(Mechanic mechanic) throws WrongVehicleTypeException;
    public void removeMechanic(Mechanic mechanic) {
        mechanics.remove(mechanic);
    }
    public void showMechanics() {
        System.out.println("Машина " + getBrand() + " " + getModel() +
                ", механик(-и):");
        if (mechanics.isEmpty()) {
            System.out.println("не назначены");
        }
        else for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic);
        }
    }

    public abstract void inspection() throws WrongVehicleTypeException;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void showRaceInfo();


    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void printType();

} //

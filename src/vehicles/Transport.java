package vehicles;


abstract public class Transport<T> implements Competing {
    private final String brand;
    private final String model;
    private final float engineVolume;

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

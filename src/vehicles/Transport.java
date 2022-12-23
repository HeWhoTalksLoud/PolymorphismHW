package vehicles;


abstract public class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.equals("")) this.brand = "default";
        else this.brand = brand;

        if (model == null || model.equals("")) this.model = "default";
        else this.model = model;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

} //


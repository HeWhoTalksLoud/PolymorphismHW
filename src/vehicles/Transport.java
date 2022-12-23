package vehicles;


public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry,
                     String color, int maxSpeed) {
        if (brand == null || brand.equals("")) this.brand = "default";
        else this.brand = brand;

        if (model == null || model.equals("")) this.model = "default";
        else this.model = model;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.equals("")) this.productionCountry = "default";
        else this.productionCountry = productionCountry;

        if (color == null || color.equals("")) this.color = "default";
        else this.color = color;

        if (maxSpeed <= 0) this.maxSpeed = 90;
        else this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) this.color = "default";
        else this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) this.maxSpeed = 90;
        else this.maxSpeed = maxSpeed;
    }

} //

package vehicles;

public class Bus extends Transport {

    private String number;
    public Bus(String brand, String model, float engineVolume, String number) {
        super(brand, model, engineVolume);

        if (number == null || number.equals("")) this.number = "default";
        else this.number = number;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус прекращает движение");
    }

    @Override
    public String toString() {
        return "автобус " + getBrand() + " " + getModel() + ", " +
                "номер: " + number + ", объем двигателя: " + getEngineVolume();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null || number.equals("")) this.number = "default";
        else this.number = number;
    }
} //

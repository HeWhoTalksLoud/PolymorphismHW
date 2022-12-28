package vehicles;

public enum BodyType {
    SEDAN("седан"),
    HATCHBACK("хэтчбек"),
    COUPE("купе"),
    UNIVERSAL("универсал"),
    OFFROAD("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private final String type;
    BodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + type;
    }
}

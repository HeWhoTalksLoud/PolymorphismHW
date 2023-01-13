package vehicles;

public enum CarryingCapacity {
    N1(0, 3.5f),
    N2(3.5f, 12),
    N3(12, 0);

    private final float lowLimit;
    private final float highLimit;
    CarryingCapacity(float lowLimit, float highLimit) {
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }


    @Override
    public String toString() {
        String low, high;
        low = lowLimit == 0 ? "" : ("от " + lowLimit + " тонн");
        high = highLimit == 0 ? "" : ("до " + highLimit + " тонн");
        return "Грузоподъемность: " + low + (low.equals("") ? "" : " ") +
                high;
    }
} //
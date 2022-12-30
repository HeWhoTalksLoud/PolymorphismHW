package vehicles;

public enum PassengerCapacity {
    EXTRA_SMALL(0, 10),
    SMALL(0, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXTRA_LARGE(100, 120);

    private final int low;
    private final int high;
    PassengerCapacity(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        String l;
        l = low == 0 ? "до " : (low + "-");
        return "Вместимость: " + l +  high + " мест";
    }
} ////

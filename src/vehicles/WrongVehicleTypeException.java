package vehicles;

public class WrongVehicleTypeException extends Exception {
    public WrongVehicleTypeException(String message) {
        super(message);
    }

    public WrongVehicleTypeException(String message, Throwable cause) {
        super(message, cause);
    }
} //

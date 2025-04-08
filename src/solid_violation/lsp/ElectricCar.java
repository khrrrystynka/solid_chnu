package solid_violation.lsp;

public class ElectricCar extends Vehicle implements ElectricVehicle {
    private static final int BATTERY_FULL = 100;
    private int batteryLevel = 0;

    @Override
    public void chargeBattery() {
        batteryLevel = BATTERY_FULL;
    }

    public int batteryLevel() {
        return batteryLevel;
    }
}
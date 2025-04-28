package solid_violation.lsp;

public class ElectricCar extends Vehicle implements Rechargeable {
    private static final int BATTERY_FULL = 100;
    private int batteryLevel = 0;

    @Override
    public void chargeBattery() {
        batteryLevel = BATTERY_FULL;
        System.out.println("Electric car charged.");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
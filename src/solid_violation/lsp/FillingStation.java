package solid_violation.lsp;

public class FillingStation {
    public void refuel(Refuelable vehicle) {
        vehicle.fillUpWithFuel();
    }

    public void charge(Rechargeable vehicle) {
        vehicle.chargeBattery();
    }
}

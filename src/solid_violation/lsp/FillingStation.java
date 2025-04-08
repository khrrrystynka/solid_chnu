package solid_violation.lsp;

public class FillingStation {
    public void refuel(FuelVehicle vehicle) {
        vehicle.fillUpWithFuel();
    }

    public void charge(ElectricVehicle vehicle) {
        vehicle.chargeBattery();
    }
}
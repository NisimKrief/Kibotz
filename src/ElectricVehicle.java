public class ElectricVehicle extends Regular{
    protected double ElectricFuelTankSize;

    public ElectricVehicle(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int kamotNosim, double electricFuelTankSize) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, kamotNosim);
        ElectricFuelTankSize = electricFuelTankSize;
    }

    public double getElectricFuelTankSize() {
        return ElectricFuelTankSize;
    }

    public void setElectricFuelTankSize(double electricFuelTankSize) {
        ElectricFuelTankSize = electricFuelTankSize;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "ElectricFuelTankSize=" + ElectricFuelTankSize +
                ", KamotNosim=" + KamotNosim +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}

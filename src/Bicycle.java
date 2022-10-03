public class Bicycle extends Light {
    protected boolean HasBusket;

    public Bicycle(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, boolean yeshManoa, boolean hasBusket) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, yeshManoa);
        HasBusket = hasBusket;
    }

    public boolean isHasBusket() {
        return HasBusket;
    }

    public void setHasBusket(boolean hasBusket) {
        HasBusket = hasBusket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "HasBusket=" + HasBusket +
                ", YeshManoa=" + YeshManoa +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}

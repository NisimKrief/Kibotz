public class Light extends Vehicles{
    protected boolean YeshManoa;

    public Light(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, boolean yeshManoa) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin);
        YeshManoa = yeshManoa;
    }

    public boolean isYeshManoa() {
        return YeshManoa;
    }

    public void setYeshManoa(boolean yeshManoa) {
        YeshManoa = yeshManoa;
    }

    @Override
    public String toString() {
        return "Light{" +
                "YeshManoa=" + YeshManoa +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}

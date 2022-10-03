public class Vehicles {
    protected int VehicleId;
    protected int VehicleAge;
    protected int VehicleWheelAmount;
    protected String EgeOrKidon;
    protected double VehicleMezahamimPerMin;

    public Vehicles(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin) {
        VehicleId = vehicleId;
        VehicleAge = vehicleAge;
        VehicleWheelAmount = vehicleWheelAmount;
        EgeOrKidon = egeOrKidon;
        VehicleMezahamimPerMin = vehicleMezahamimPerMin;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getVehicleAge() {
        return VehicleAge;
    }

    public void setVehicleAge(int vehicleAge) {
        VehicleAge = vehicleAge;
    }

    public int getVehicleWheelAmount() {
        return VehicleWheelAmount;
    }

    public void setVehicleWheelAmount(int vehicleWheelAmount) {
        VehicleWheelAmount = vehicleWheelAmount;
    }

    public String getEgeOrKidon() {
        return EgeOrKidon;
    }

    public void setEgeOrKidon(String egeOrKidon) {
        EgeOrKidon = egeOrKidon;
    }

    public double getVehicleMezahamimPerMin() {
        return VehicleMezahamimPerMin;
    }

    public void setVehicleMezahamimPerMin(double vehicleMezahamimPerMin) {
        VehicleMezahamimPerMin = vehicleMezahamimPerMin;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon=" + EgeOrKidon +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }

}

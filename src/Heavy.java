public class Heavy extends Vehicles{
    protected int HowManyVehiclesCanItTake;

    public Heavy(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int howManyVehiclesCanItTake) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin);
        HowManyVehiclesCanItTake = howManyVehiclesCanItTake;
    }

    public int getHowManyVehiclesCanItTake() {
        return HowManyVehiclesCanItTake;
    }

    public void setHowManyVehiclesCanItTake(int howManyVehiclesCanItTake) {
        HowManyVehiclesCanItTake = howManyVehiclesCanItTake;
    }

    @Override
    public double exhaust() {
        return super.exhaust() + 500 * getHowManyVehiclesCanItTake();
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "HowManyVehiclesCanItTake=" + HowManyVehiclesCanItTake +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}


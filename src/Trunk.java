public class Trunk extends Truck{
    protected int HowManyThingsInIt;

    public Trunk(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int howManyVehiclesCanItTake, double maxWeight, int howManyThingsInIt) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, howManyVehiclesCanItTake, maxWeight);
        HowManyThingsInIt = howManyThingsInIt;
    }

    public int getHowManyThingsInIt() {
        return HowManyThingsInIt;
    }

    @Override
    public String toString() {
        return "Trunk{" +
                "HowManyThingsInIt=" + HowManyThingsInIt +
                ", MaxWeight=" + MaxWeight +
                ", HowManyVehiclesCanItTake=" + HowManyVehiclesCanItTake +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }

    public void setHowManyThingsInIt(int howManyThingsInIt) {
        HowManyThingsInIt = howManyThingsInIt;
    }
}

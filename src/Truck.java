public class Truck extends Heavy{
    protected double MaxWeight;

    public Truck(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int howManyVehiclesCanItTake, double maxWeight) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, howManyVehiclesCanItTake);
        MaxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return MaxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        MaxWeight = maxWeight;
    }
}

public class Tractor extends Heavy{
    protected int SogeyNigrarim;

    public Tractor(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int howManyVehiclesCanItTake, int sogeyNigrarim) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, howManyVehiclesCanItTake);
        SogeyNigrarim = sogeyNigrarim;
    }

    public int getSogeyNigrarim() {
        return SogeyNigrarim;
    }

    public void setSogeyNigrarim(int sogeyNigrarim) {
        SogeyNigrarim = sogeyNigrarim;
    }
}

public class Regular extends Vehicles {
    protected int KamotNosim;

    public Regular(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, int kamotNosim) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin);
        KamotNosim = kamotNosim;
    }

    public int getKamotNosim() {
        return KamotNosim;
    }

    public void setKamotNosim(int kamotNosim) {
        KamotNosim = kamotNosim;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "KamotNosim=" + KamotNosim +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}

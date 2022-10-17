public class Cart extends Light{
    protected double ChargeTime;

    public Cart(int vehicleId, int vehicleAge, int vehicleWheelAmount, String egeOrKidon, double vehicleMezahamimPerMin, boolean yeshManoa, double chargeTime) {
        super(vehicleId, vehicleAge, vehicleWheelAmount, egeOrKidon, vehicleMezahamimPerMin, yeshManoa);
        ChargeTime = chargeTime;
    }

    public double getChargeTime() {
        return ChargeTime;
    }

    public void setChargeTime(double chargeTime) {
        ChargeTime = chargeTime;
    }

    @Override
    public double exhaust() {
        return super.exhaust() / (getChargeTime() * 0.5);
    }

    public int hitchhikers(int anashimnosafim){
        if (anashimnosafim >= 2){
            System.out.println("Sorry I can take only 1");
            anashimnosafim = 1;
        }

        return anashimnosafim;

    }

    @Override
    public String toString() {
        return "Cart{" +
                "ChargeTime=" + ChargeTime +
                ", YeshManoa=" + YeshManoa +
                ", VehicleId=" + VehicleId +
                ", VehicleAge=" + VehicleAge +
                ", VehicleWheelAmount=" + VehicleWheelAmount +
                ", EgeOrKidon='" + EgeOrKidon + '\'' +
                ", VehicleMezahamimPerMin=" + VehicleMezahamimPerMin +
                '}';
    }
}

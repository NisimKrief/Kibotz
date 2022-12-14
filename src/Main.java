public class Main {
    public static void main(String[] args) {


    }
    public static double SumKamotMezahamim(Vehicles[] rehavim){
        double summezahem = 0;
        for(int i = 0; i < rehavim.length ; i++){
            summezahem = summezahem + rehavim[i].exhaust();

        }
        return summezahem;

    }
    public static void RehavimNoise(Vehicles[] rehavim){
        for(int i = 0; i < rehavim.length; i++){
            if(rehavim[i] instanceof Regular){
                ((Regular) rehavim[i]).noise();
            }
        }
    }
    public static int KamotNosimLoKolelNaag(Vehicles[] rehavim){
        int sumkamotnosimlokolelnaag = 0;
        for (int i = 0; i < rehavim.length; i++){
            if(rehavim[i] instanceof Regular){
                sumkamotnosimlokolelnaag =+ ((Regular) rehavim[i]).getKamotNosim();
            }
        }
        return sumkamotnosimlokolelnaag;
    }
    public static int MaxChargeTime(Vehicles[] rehavim){
        double maxchargetime = 0;
        int carId = 0;
        for(int i = 0; i < rehavim.length; i++){
            if(rehavim[i] instanceof Cart){
                if(((Cart) rehavim[i]).getChargeTime() > maxchargetime){
                    maxchargetime = ((Cart) rehavim[i]).getChargeTime();
                    carId = rehavim[i].getVehicleId();
                }
            }
        }
        return carId;
    }
}
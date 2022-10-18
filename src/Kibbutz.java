public class Kibbutz {
    Vehicles[] rehavim = new Vehicles[500];
    int kamotrehavimbakibutz;

    public Kibbutz() {
        kamotrehavimbakibutz = 0;
    }
    public void mosifrehev(Vehicles car){
        kamotrehavimbakibutz++;
        rehavim[kamotrehavimbakibutz] = car;

    }
    private Vehicles[] oldvehicleswithege(Vehicles[] rehavim){
        int j = 0;
        int kamotrehavimmeyohadim = 0;
        for (int i = 0; i < rehavim.length; i++){
            if (rehavim[i].getVehicleAge() > 15 && rehavim[i].getEgeOrKidon() == "Ege"){
                kamotrehavimmeyohadim++;
            }
        }
        Vehicles[] rehavimmeyohadim = new Vehicles[kamotrehavimmeyohadim];
        for (int i = 0; i < rehavim.length; i++){
            if (rehavim[i].getVehicleAge() > 15 && rehavim[i].getEgeOrKidon() == "Ege"){
                rehavimmeyohadim[j] = rehavim[i];
                j++;
            }
        }
        return rehavimmeyohadim;

    }
    private int CarsOrLightWithEge(Vehicles[] rehavim){
        int sum=0;
        for (int i=0; i<rehavim.length; i++){
            if (rehavim[i] instanceof Regular || rehavim[i] instanceof Light)
                if (rehavim[i].getEgeOrKidon()=="Ege")
                    sum++;
        }
        return sum;
    }
}

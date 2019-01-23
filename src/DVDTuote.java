public class DVDTuote extends Tuote {

    private int kesto;
    private String suositus;

    public DVDTuote(){
        super();
        kesto = 0;
        suositus = "";
    }

    public DVDTuote(int tuoteKoodi,String nimi,double hinta, int kesto, String suositus){
        super(tuoteKoodi,nimi,hinta);
        this.kesto = kesto;
        this.suositus = suositus;
    }

    public int getKesto() {
        return kesto;
    }

    public String getSuositus() {
        return suositus;
    }

    public void setKesto(int kesto) {
        this.kesto = kesto;
    }

    public void setSuositus(String suositus) {
        this.suositus = suositus;
    }

    @Override
    public String toString() {
        return "DVDTuote{" +
                "kesto=" + kesto +
                ", suositus='" + suositus + '\'' +
                '}';
    }
}

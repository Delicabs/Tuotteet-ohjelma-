public class KirjaTuote extends Tuote {
    private int sivuMäärä;
    private String sidosAsu;

    public KirjaTuote(){
        super();
        sivuMäärä = 0;
        sidosAsu = "";
    }
    public KirjaTuote(int tuoteKoodi,String nimi,double hinta, int sivuMäärä, String sidosAsu){
        super(tuoteKoodi, nimi, hinta);
        this.sivuMäärä = sivuMäärä;
        this.sidosAsu = sidosAsu;
    }

    public int getSivuMäärä() {
        return sivuMäärä;
    }

    public String getSidosAsu() {
        return sidosAsu;
    }

    public void setSivuMäärä(int sivuMäärä) {
        this.sivuMäärä = sivuMäärä;
    }

    public void setSidosAsu(String sidosAsu) {
        this.sidosAsu = sidosAsu;
    }

    @Override
    public String toString() {
        return "KirjaTuote{" +
                "sivuMäärä=" + sivuMäärä +
                ", sidosAsu='" + sidosAsu + '\'' +
                '}';
    }
}

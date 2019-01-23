public class Tuote {
    private int tuoteKoodi;
    private String nimi;
    private Double hinta;


    public Tuote(int tuoteKoodi, String nimi, double hinta) {
        this.tuoteKoodi = tuoteKoodi;
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public Tuote() {
        tuoteKoodi = 0;
        nimi = "";
        hinta = 0.00;

    }

    public int getTuoteKoodi() {
        return tuoteKoodi;
    }

    public String getNimi() {
        return nimi;
    }

    public Double getHinta() {
        return hinta;
    }

    public void setTuoteKoodi(int tuoteKoodi) {
        this.tuoteKoodi = tuoteKoodi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setHinta(Double hinta) {
        this.hinta = hinta;
    }

    @Override
    public String toString() {
        return "Tuote{" +
                "tuoteKoodi=" + tuoteKoodi +
                ", nimi='" + nimi + '\'' +
                ", hinta=" + hinta +
                '}';
    }
}

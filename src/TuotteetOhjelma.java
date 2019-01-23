import java.util.Scanner;
public class TuotteetOhjelma {
  private   static KirjaTuote kirjaTuote = new KirjaTuote();
  private   static DVDTuote dvdTuote = new DVDTuote();

    public static void main(String[] args){
        syötäKirja();
        syötäDVD();
        tulostaKirja();
        tulostaDVD();



    }

    public static void syötäKirja(){
        Scanner input = new Scanner(System.in);
        System.out.println("Syötä kirjatuotteen tiedot!");

        System.out.println("Anna tuotekoodi: ");
        kirjaTuote.setTuoteKoodi(input.nextInt());
        input.nextLine();
        System.out.println("Anna nimi: ");
        kirjaTuote.setNimi(input.nextLine());
        System.out.println("Anna hinta: ");
        kirjaTuote.setHinta(input.nextDouble());
        input.nextLine();
        System.out.println("Anna sivumäärä: ");
        kirjaTuote.setSivuMäärä(input.nextInt());
        input.nextLine();
        System.out.println("Anna sidosasu: ");
        kirjaTuote.setSidosAsu(input.nextLine());




      //kirjaTuote = new KirjaTuote(aTuoteKoodi,aName,aHinta,aSivuMäärä,aSidosasu);

    }
    public static void syötäDVD(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Syötä dvdtuotteen tiedot!");

        System.out.println("Anna tuotekoodi: ");
        dvdTuote.setTuoteKoodi(input2.nextInt());
        input2.nextLine();
        System.out.println("Anna nimi: ");
        dvdTuote.setNimi(input2.nextLine());
        System.out.println("Anna hinta: ");
        dvdTuote.setHinta(input2.nextDouble());
        input2.nextLine();
        System.out.println("Anna kesto(min): ");
        dvdTuote.setKesto(input2.nextInt());
        input2.nextLine();
        System.out.println("Anna ikäsuositus: ");
        dvdTuote.setSuositus(input2.nextLine());


        //dvdTuote = new DVDTuote(aTuoteKoodi,aName,aHinta,aKesto,aIkäSuositus);

    }

    public static void tulostaKirja(){

        System.out.println("KIRJATUOTTEEN TIEDOT:");
        System.out.println("Tuotekoodi: "+kirjaTuote.getTuoteKoodi());
        System.out.println("Nimi: "+kirjaTuote.getNimi());
        System.out.println("Hinta: "+kirjaTuote.getHinta());
        System.out.println("Sivumäärä: "+kirjaTuote.getSivuMäärä());
        System.out.println("Sidosasu: "+kirjaTuote.getSidosAsu());

    }
    public static void tulostaDVD(){
        System.out.println("DVDTUOTTEEN TIEDOT: ");
        System.out.println("Tuotekoodi: "+dvdTuote.getTuoteKoodi());
        System.out.println("Nimi: "+dvdTuote.getNimi());
        System.out.println("Hinta: "+dvdTuote.getHinta());
        System.out.println("Kesto(min): "+dvdTuote.getKesto());
        System.out.println("Ikäsuositus: "+dvdTuote.getSuositus());

    }
}

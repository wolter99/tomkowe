import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */
public class Miejsce implements KinoInterface{
    public String imie;
    public String nazwisko;
    public int numer;
    boolean zarezerwowane;
    static Scanner scanner = new Scanner(System.in);

    public Miejsce(String imie, String nazwisko, int numer, boolean zarezerwowane) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.zarezerwowane = zarezerwowane;
    }

    public Miejsce() {
        this.imie = "";
        this.nazwisko = "";
        this.numer = 0;
        this.zarezerwowane = false;
    }

    @Override
    public void wypisz() {
        if (zarezerwowane){
            System.out.println("Rezerwacja "+imie+" "+nazwisko+" na miejsce "+numer);
        }
        else {
            System.out.println("Miejsce "+numer+" jest wolne");
        }
    }

    public void zarezerwuj(){
        if (zarezerwowane){
            System.out.println("Miejsce już zarezerwowane, prosze wybrac inne");
        }
        else {
            imie = scanner.nextLine();
            nazwisko = scanner.nextLine();
            zarezerwowane = true;
            System.out.println("Zarezerwowales miejsce "+numer+ " jako: "+imie+" "+ nazwisko);
        }
    }

    @Override
    public void wycofajRezewacje(){
        if(zarezerwowane){
            imie = "";
            nazwisko = "";
            zarezerwowane = false;
            System.out.println("Anulowales rezerwacje");
        }
        else{
            System.out.println("Taka rezerwacja nei istnieje");
        }
    }

    public boolean czyZarezerwowane(){
        return zarezerwowane;
    }

}

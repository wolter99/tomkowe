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
    public void wypisz() { //wypisze kto ma rezerwacje na jakim miejscu
        if (zarezerwowane){
            System.out.println("Miejsce "+numer+" zarezerwowane przez "+imie+" "+nazwisko);
        }
        else {
            System.out.println("Miejsce "+numer+" jest wolne");
        }
    }

    @Override
    public void wczytaj() {
        System.out.println("Podaj imie");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = scanner.nextLine();
    }

    @Override
    public void zarezerwuj(){
        if (zarezerwowane){
            System.out.println("Miejsce już zarezerwowane, prosze wybrac inne");
        }
        else {
            wczytaj();
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
            System.out.println("Taka rezerwacja nie istnieje");
        }
    }


    public boolean czyZarezerwowane(){
        return zarezerwowane;
    }

}

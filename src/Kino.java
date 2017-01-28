import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */


public class Kino implements KinoInterface {

    private static int iloscFilmow = 5; //max filmow w kinie
    private int wybranyFilm;
    private ArrayList<Film> filmy = new ArrayList<>();
    private int liczbaDodanychFilmow; //aktualna liczba filmow w kinie
    private Scanner scanner = new Scanner(System.in);

    public Kino() {
        this.wybranyFilm = 0;
        this.liczbaDodanychFilmow = 0;
    }

    public void wypiszWolneMiejsca(){
        for(Film f:filmy){
            f.wypisz();
            f.wypiszWolneMiejsca();
            System.out.println();
        }
    }

    public void wypiszZarezerwowaneMiejsca(){
        for(Film f:filmy){
            f.wypisz();
            f.wypiszZarezerwowaneMiejsca();
            System.out.println();
        }
    }

    @Override
    public void wypiszWszystkieMiejsca(){
        for(Film f:filmy){
            f.wypisz();
            f.wypiszWszystkieMiejsca();
            System.out.println();
        }
    }

    @Override
    public void wypisz() {

    }

    @Override
    public void zarezerwuj(){
        System.out.println("Rezerwacja w toku...");
        wybierzFilm();

        if(wybranyFilm!=0) {
            filmy.get(wybranyFilm - 1).zarezerwuj();
        }
    }

    @Override
    public void wycofajRezewacje() {
        System.out.println("Zezygnacja z rezerwcji...");
        wybierzFilm();
        if(wybranyFilm!=0) {
            filmy.get(wybranyFilm - 1).wycofajRezewacje();
        }
    }

    public void sprawdzMiejsce(){
        System.out.println("Sprawdzanie miejsca...");
        wybierzFilm();
        if(wybranyFilm!=0){

            filmy.get(wybranyFilm-1).sprawdzMiejsce();
        }

    }

    public void dodajFilm(String tytul){
        if (liczbaDodanychFilmow < iloscFilmow){
            filmy.add(new Film(tytul));
            liczbaDodanychFilmow++;
            System.out.println("Dodano film: "+ tytul);
        }
        else
        {
            System.out.println("Osiagnieto maksymalna liczbe filmow");
        }
    }

    public void wybierzFilm(){
        wyswietlFilmy();
        wczytaj();

        if(wybranyFilm>iloscFilmow || wybranyFilm<=0){
                System.out.println("Nie ma takiego filmu");
                wybranyFilm = 0;
                System.out.println();
        }
    }

    public void wyswietlFilmy(){
        int i = 1;
        for (Film f:filmy){
            System.out.println("Film nr: "+ i);
            f.wypisz();
            i++;
        }
        i--;
        System.out.println("Filmow jest "+i);
        System.out.println();
    }

    @Override
    public void wczytaj(){
        System.out.println("Wybierz film: ");
        wybranyFilm = scanner.nextInt();
        System.out.println();
    }
}

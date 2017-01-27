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

    public Kino() {
        this.wybranyFilm = 0;
        this.liczbaDodanychFilmow = 0;
    }

    public void wypiszWolneMiejsca(){ //wypisuje wolne miejsca miejsca na kazdy film

    }

    public void wypiszZarezerwowaneMiejsca(){

    }

    @Override
    public void wypisz() { //wypisuje wszystkie miejsca miejsca na kazdy film

    }

    @Override
    public void zarezerwuj(){

    }

    @Override
    public void wycofajRezewacje() {

    }


    public void sprawdzMiejsce(){

    }

    public void dodajFilm(){

    }

    public void wybierzFilm(){

    }

    public void wyswietlFilmy(){
        
    }

    @Override
    public void wczytaj(){
        //System.out.println("Podaj miejsce:");
        //wybraneMiejsce = scanner.nextInt();
        //for (int i = 0; i < 20; ++i) System.out.println();
    }
}

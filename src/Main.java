import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */


public class Main{

    static int opcjaMenu = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Kino kino = new Kino();
        showMenu();
        wczytaj();

        kino.dodajFilm("Szklana Puapka");
        kino.dodajFilm("Avangers");
        kino.dodajFilm("Star Wars");
        kino.dodajFilm("Szybcy i Wsciekli");
        

        while(opcjaMenu != 5)
        {
            switch(opcjaMenu)
            {
                case 1:
                    System.out.println("Dodaj rezerwacje:");
                    kino.zarezerwuj();
                    czekaj();
                    break;
                case 2:
                    System.out.println("Usun rezerwacje:");
                    kino.wycofajRezewacje();
                    czekaj();
                    break;
                case 3:
                    System.out.println("Sprawdz miejsce:");
                    kino.sprawdzMiejsce();
                    czekaj();
                    break;
                case 4:
                    System.out.println("Miejsca:");
                    kino.wypisz();
                    System.out.println();
                    czekaj();
                    break;
            }

            showMenu();
            wczytaj();
        }
    }

    public static void czekaj() throws IOException {
        System.out.println("nacisnij enter aby kontynuowac");
        System.in.read();
    }

    private static void showMenu() {
        System.out.println("System rezerwacji miejsc");
        System.out.println("Wybierz opcje:");
        System.out.println("1 - Dodaj rezerwacje");
        System.out.println("2 - Usun rezerwacje");
        System.out.println("3 - Sprawdz miejsce");
        System.out.println("4 - Wyswietl wszystkie miejsca");
        System.out.println("5 - Zamknij system");
    }

    private static void wczytaj(){
        System.out.println("Podaj opcje:");
        opcjaMenu = scanner.nextInt();
        for (int i = 0; i < 20; ++i) System.out.println();
    }

}

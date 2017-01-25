import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */


public class Main {

    static int opcjaMenu = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Kino kino;


        //kino.wyswietl_wszystkie_miejsca();
        showMenu();
        wczytaj();

        while(opcjaMenu != 7)
        {
            switch(opcjaMenu)
            {
                case 1:
//                    kino.dodaj_rezerwacje();
                    System.out.println("opcja 1");
                    break;
                case 2:
//                    kino.anuluj_rezerwacje();
                    System.out.println("opcja 2");
                    break;
                case 3:
//                    kino.sprawdz_miejsce();
                    break;
                case 4:
//                    kino.wyswietl_wszystkie_miejsca();
//                    wczytaj();
                    break;
                case 5:
//                    kino.wyswietl_wolne_miejsca();
//                    wczytaj();
                    break;
                case 6:
//                    kino.wyswietl_zarezerwowane_miejsca();
//                    wczytaj();
                    break;
            }

            showMenu();
            wczytaj();
        }
    }

    private static void wczytaj() throws IOException {
        System.out.println("Podaj opcje:");
        opcjaMenu = scanner.nextInt();
        

    }


    private static void showMenu() {
        System.out.println("System rezerwacji miejsc");
        System.out.println("Wybierz opcje:");
        System.out.println("1 - Dodaj rezerwacje");
        System.out.println("2 - Usun rezerwacje");
        System.out.println("3 - Sprawdz miejsce");
        System.out.println("4 - Wyswietl wszystkie rezerwacje");
        System.out.println("5 - Wyswietl wolne miejsca");
        System.out.println("6 - Wyswietl zarezerwowane miejsca");
        System.out.println("7 - Zamknij system");
    }

}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */
public class Film implements KinoInterface{
    private static int liczbaMiejsc = 10;
    private int wybraneMiejsce;
    private String tytul;
    private ArrayList<Miejsce> miejsca = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Film() {
        this.tytul = "";
        this.wybraneMiejsce = 0;
        for (int i = 0 ; i < liczbaMiejsc ; i++){
            miejsca.add(new Miejsce("","",i+1,false));
        }
    }

    public Film(String tytul) {
        this.tytul = tytul;
        this.wybraneMiejsce = 0;
        for (int i = 0 ; i < liczbaMiejsc ; i++){
            miejsca.add(new Miejsce("","",i+1,false));
        }
    }

    @Override
    public void wypisz() {
        System.out.println("Tytul: " + tytul);
    }

    @Override
    public void wypiszWszystkieMiejsca() {
        for(Miejsce m:miejsca){
            m.wypisz();
        }
    }

    public void wypiszWolneMiejsca(){
        for(Miejsce m:miejsca){
            if (!m.czyZarezerwowane()){
                System.out.print(m.numer+", ");
            }
        }

    }

    public void wypiszZarezerwowaneMiejsca(){
        for(Miejsce m:miejsca){
            if (m.czyZarezerwowane()){
                System.out.print(m.numer+", ");
            }
        }

    }

    @Override
    public void zarezerwuj(){
        System.out.println("Wybierz miejsce:");
        wypiszWolneMiejsca();
        wybierzMiejsce();
        if(wybraneMiejsce>0 && wybraneMiejsce<=liczbaMiejsc){
            miejsca.get(wybraneMiejsce-1).zarezerwuj();
        }
    }

    @Override
    public void wycofajRezewacje() {
        System.out.println("Wybierz miejsce:");
        wypiszZarezerwowaneMiejsca();
        wybierzMiejsce();
        if(wybraneMiejsce>0 && wybraneMiejsce<=liczbaMiejsc){
            for(Miejsce m:miejsca){
                if (m.numer==wybraneMiejsce){
                    m.wycofajRezewacje();
                    break;
                }
            }
        }
    }

    public void wybierzMiejsce(){
        wczytaj();

        if(wybraneMiejsce<=0 || wybraneMiejsce>liczbaMiejsc){
            System.out.println("wybrales liczbe z poza zakresu");
            wybraneMiejsce = 0;
        }

    }

    public void sprawdzMiejsce(){
        System.out.println("Wybierz miejsce od 1 do "+liczbaMiejsc);
        wybierzMiejsce();
        if(wybraneMiejsce>0 && wybraneMiejsce<=liczbaMiejsc){
            miejsca.get(wybraneMiejsce - 1).wypisz();
        }
        wybraneMiejsce=0;
    }

    @Override
    public void wczytaj(){

        wybraneMiejsce = scanner.nextInt();
        //for (int i = 0; i < 20; ++i) System.out.println();
    }
}

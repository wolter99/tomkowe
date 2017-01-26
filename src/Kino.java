import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tomasz on 2017-01-25.
 */


public class Kino implements KinoInterface {
    private static int liczbaMiejsc = 10;
    private int wybraneMiejsce;
    private ArrayList<Miejsce> miejsca = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Kino() {
        this.wybraneMiejsce = 0;
        for (int i = 0 ; i < liczbaMiejsc ; i++){
            miejsca.add(new Miejsce("","",i+1,false));
        }
    }

    @Override
    public void wypisz() { //wypisze wszystkie mejsca
        for(Miejsce m:miejsca){
                m.wypisz();
        }
    }

    private void wypiszWolneMiejsca(){
        System.out.println("Wolne miejsca prosze wybrac jedno:");
        for(Miejsce m:miejsca){
            if (!m.czyZarezerwowane()){
                System.out.print(m.numer+", ");
            }
        }
    }

    private void wypiszZarezerwowaneMiejsca(){
        System.out.println("Zarezerwowane miejsca prosze wybrac jedno aby anulowac:");
        for(Miejsce m:miejsca){
            if (m.czyZarezerwowane()){
                System.out.print(m.numer+", ");
            }
        }
    }

    @Override
    public void zarezerwuj(){
        wypiszWolneMiejsca();
        wybierzMiejsce();
        if(wybraneMiejsce>0 && wybraneMiejsce<=liczbaMiejsc){
            miejsca.get(wybraneMiejsce-1).zarezerwuj();
        }
    }

    @Override
    public void wycofajRezewacje() {
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
        wybierzMiejsce();
        if(wybraneMiejsce>0 && wybraneMiejsce<=liczbaMiejsc){
            miejsca.get(wybraneMiejsce - 1).wypisz();
        }
        wybraneMiejsce=0;
    }

    @Override
    public void wczytaj(){
        System.out.println("Podaj miejsce:");
        wybraneMiejsce = scanner.nextInt();
        //for (int i = 0; i < 20; ++i) System.out.println();
    }
}

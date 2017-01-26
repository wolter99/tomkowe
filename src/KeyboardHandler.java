import java.util.Scanner;

/**
 * Created by epamaro on 2017-01-26.
 */
public class KeyboardHandler {

    protected static void wczytaj(int opcjaMenu, Scanner scanner){
        System.out.println("Podaj opcje:");
        Main.opcjaMenu = scanner.nextInt();
        clearScreen();
    }

    protected static void clearScreen() {
        for (int i = 0; i < 20; ++i) System.out.println();
    }
}

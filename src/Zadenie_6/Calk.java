package Zadenie_6;
import java.util.Scanner;

public class Calk {
    Scanner scanner = new Scanner(System.in);
    Main main = new Main();

    int wczytatwanieLiczby() {
        int liczba;

        do {
            System.out.println("Podaj licbę ");
            liczba = scanner.nextInt();
            if (liczba < main.min) {
                System.out.println("Podana liczba jest za mała");
            } else if (liczba > main.max) {
                System.out.println("Podana liczba jest za duża");
            }
        } while (liczba <= main.min && liczba >= main.max) ;
        return liczba;
    }

        boolean DivisibleByThree ( int liczba){
            return liczba % 3 == 0;
        }
    }


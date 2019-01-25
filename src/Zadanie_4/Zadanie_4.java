package Zadanie_4;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMANY);

        Point point = new Point();
        System.out.println("Podaj współrzędnie punktu");
        System.out.println("Podaj X - ");
        point.setX(sc.nextDouble());
        System.out.println("Podaj Y - ");
        point.setY(sc.nextDouble());

        Calk calk = new Calk();
        int cwiartka = calk.ktoraCwiartka(point);

        if (cwiartka == 0) {
            System.out.println("Jest to środek układu współrzędnych\n" + point.toString());
        } else {
            System.out.println("Punkt jest w " + cwiartka + " ćwartce układu współ.\n" + point.toString());
        }
    }
}

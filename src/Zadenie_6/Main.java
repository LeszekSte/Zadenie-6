package Zadenie_6;

import java.util.Scanner;

public class Main {
    final int min = 100;
    final int max = 200;

    public static void main(String[] args) {
        Main mm = new Main();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj liczbę, którą sobie życzę z zakresu od %d do %d\n", mm.min, mm.max);
        Calk calk = new Calk();

        int probaNr = 0;
        boolean test;
        do {
            int liczba = calk.wczytatwanieLiczby(++probaNr);
            test = (liczba >= mm.min && liczba<= mm.max);


        } while (test);




    }


}

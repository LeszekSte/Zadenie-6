package Zadanie_3;

public class Zadanie_3 {


    public static void main(String[] args) {

        final int MIN = 0;
        final int MAX = 3;
        final double skok = 0.1;

        System.out.println("Warsja do{}while  ");

        double i = MIN;
        System.out.printf("%.1f,", i);
        do {
            i += skok;
            System.out.printf("%.1f,", i);
        } while (i <= MAX);


        System.out.println("\nWarsja  while{}");
        i = MIN;
        //System.out.printf("%.1f,", i);

        while (i <(MAX+skok)) {
            System.out.printf("%.1f,", i);
            i += skok;
        }
    }
}

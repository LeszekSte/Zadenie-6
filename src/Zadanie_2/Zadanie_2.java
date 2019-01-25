package Zadanie_2;

public class Zadanie_2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 1, 2, 1};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                suma += numbers[i];
            }
        }
        System.out.println("Suma  1,3 i 5  liczby wynosi -  " + suma);
    }
}

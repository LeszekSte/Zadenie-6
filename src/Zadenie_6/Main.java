package Zadanie_6;
public class Main {
    final int min = 100;
    final int max = 200;

    public static void main(String[] args) {
        Main main = new Main();

        //   Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj liczbę, którą z zakresu od %d do %d\n", main.min, main.max);
        Calk calk = new Calk();
        boolean podzielna;
        boolean jestWZakresie;

        do {
            int liczba = calk.wczytatwanieLiczby();
            jestWZakresie = (liczba >= main.min && liczba <= main.max);
            podzielna = calk.DivisibleByThree(liczba);

            if (podzielna && jestWZakresie) {
                System.out.println("Twoja liczba jest podzialna przez 3");
            } else if (jestWZakresie) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            }
        } while (!(podzielna && jestWZakresie));
    }
}

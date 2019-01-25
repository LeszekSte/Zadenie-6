package Zadanie_1;

public class Main {
    public static void main(String[] args) {

//        Wersja 1

        String [] imiona = new String[3];
        imiona[0] = "Marek";
        imiona[1] = "Darek";
        imiona[2] = "Wojtek";

//        Wersja 2
        String [] iminna2 = {"Jola", "Ala", "Agatka"};

        wydruk(imiona);
        wydruk(iminna2);
    }

    static void wydruk (String [] tab){
        System.out.println("Wydruk znajomych");
        int i = 0;
        for (String im: tab ){
            System.out.println(++i + ". "+ im);
        }
    }


}

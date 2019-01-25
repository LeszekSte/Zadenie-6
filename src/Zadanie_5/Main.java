package Zadanie_5;
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        for (int  i = 0; i <= 100; i++ ){
            if (i%2 != 0){
               continue;
            }
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Suma  liczb przystych od (0-100) =  " + sum);
    }
}

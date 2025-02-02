package d07ternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi alin
        Eger tamsayi sifirdan kucuk ise ekrana "negatif" yazdirin
        Diger durumlarada ekrana "negatif degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s = scan.nextInt();

       String result =  s<0 ? "Negatif" : "negatif degil" ;
        System.out.println(result);
    }
}

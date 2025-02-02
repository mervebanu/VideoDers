package d05typecastıng;

import java.util.Scanner;

public class OrnekDegerDegistirme {
    public static void main(String[] args) {
        // Swap islemi
        /* a variable inin degeri 12, b variable nin degeri 25 olsun
        Oyle bir kod yazinizki  a = 25, b= 12 olsun
        Sayilari kullanicidan alin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double a = scan.nextDouble(); // 12 olsun
        double b = scan.nextDouble(); // 25 olsun
        System.out.println("a = " + a);;
        System.out.println("b = " + b);

        //1. yol Ucuncu bir variable kullandik.
        double temp = 0;
        temp = a; // temp = 12 oldu   a = 12
        a = b; //temp = 12,  a = 25 oldu , b hala 25
        b = temp;  // temp = 12 , a = 25,  b = 12
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("===========");

        // 2.Yo: ucuncu bir variable kullanmadan
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}

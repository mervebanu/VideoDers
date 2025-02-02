package d06if;

import java.util.Scanner;

public class NestedIfSoru03 {
    public static void main(String[] args) {
        /* Kullanicidan password girmesini isteyin.

        Girdigi password 5 ile bolunuyorsa son rakamini kontrol edin
        Son rakami 0 ise ekrana  "5 ile bolunen cift sayi" yazsin
        Son rakami sifir degilse "5 ile bolunen tek sayi" yazsin

        Girdigi password 5 ile bolunmuyorsa ekrana "Tekrar deneyin" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir password giriniz");
        int pwd = scan.nextInt();

        if(pwd % 5 ==0){
           if(pwd % 10 ==0) {
               System.out.println("5 ile bolunen cift sayi");
           } else {
               System.out.println("5 ile bolunen tek sayi");
           }
        } else {
            System.out.println("tekrar deneyin");
        }
    }
}

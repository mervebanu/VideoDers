package d11whileloop;

import java.util.Scanner;

public class Whileloop03 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soy ismini aliniz
        Kullanicinin ilk isminin ilk harfinden soy isminin son harfine kadar
        olan butun harfleri buyuk harf olarak ekrana ayni satirda aralarinda
        bosluk olarak yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        char ilkHarf = scan.nextLine().toUpperCase().charAt(0);

        System.out.println("Soy adinizi giriniz");
        String soyAd= scan.nextLine().toUpperCase();
        char sonHarf = soyAd.charAt(soyAd.length()-1);


        if(ilkHarf<=sonHarf){
        while (ilkHarf<=sonHarf) {

            System.out.print(ilkHarf + " ");
            ilkHarf++;
        }

        } else {
            while (sonHarf<=ilkHarf){
                System.out.print(sonHarf + " ");
                sonHarf++;
            }
        }
        scan.close();



    }
}

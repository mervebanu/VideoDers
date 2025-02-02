package d09forloops;

import java.util.Scanner;

public class Foorloop10 {
    public static void main(String[] args) {
        /*
        kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden
        baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana
        yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("baslangic ve bitis harflerini veriniz");
        char bas = scan.next().toUpperCase().charAt(0);
        char bit = scan.next().toUpperCase().charAt(0);

        if(!(bas>= 'A' && bas<='Z') || !(bit>= 'A' && bit<='Z')){
            System.out.println("Lutfen bir harf giriniz");
        }

        else if (bas <= bit) {
            for (char i = bas; i <= bit; i++) {
                System.out.println(i);
            }

        } else {
            for (char i = bas; i >= bit; i--) {
                System.out.println(i);
            }
          scan.close();

        }
    }
}

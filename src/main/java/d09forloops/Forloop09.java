package d09forloops;

import java.util.Scanner;

public class Forloop09 {
    public static void main(String[] args) {
        /* Kullanicidan baslangic ve bitis degerlerini aliniz
        Baslangic ve bitis degerleri nasil olursa olsun carpimi hesaplayan
        baslangic degerinden bitis degerine kadar tum sayilarin carpimini
        hesaplayan kodu yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis degeri giriniz");
        int bit = scan.nextInt();
        
        int carpim = 1;
        
        if(bas<bit){
            for(int i =bas; i<=bit; i++){
                carpim = carpim * i;
            }
            System.out.println("carpim = " + carpim);
        } else {
            for(int i =bas; i>=bit; i--){
                carpim = carpim * i;
            }
            System.out.println("carpim = " + carpim);
            scan.close();
        }

    }
}

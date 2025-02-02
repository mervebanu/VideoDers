package d09forloops;

import java.util.Scanner;

public class Forloop02 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degerini aliniz.
        Baslangic degerinden baslayip bitis degerinde biten tum sayilari ekrana yazdiriniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degeri icin bir sayi giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Bitis degeri icin bir sayi giriniz");
        int bitis = scan.nextInt();

        if(baslangic > bitis){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        } else {
            for(int i = baslangic; i<=bitis; i++){
                System.out.print(i + " ");
            }
        }

    }
}

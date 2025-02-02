package d09forloops;

import java.util.Scanner;

public class Forloop03 {
    public static void main(String[] args) {
       /* Kullanicidan baslangic ve bitis degerini aliniz.
        Baslangic degerinden baslayip bitis degerinde biten tum cift sayilari
        ekrana yazdiriniz.
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz ");
        int bas = scan.nextInt();
        System.out.println("Bitis degeri giriniz");
        int bit = scan.nextInt();

        if(bit > bas){
            for(int i = bas; i<=bit; i++){
                if(i%2 == 0){
                    System.out.print(i + " ");
                }
            }
            } else{
            System.out.println("baslangic degeri kucuk olmali");
        }
    }
}

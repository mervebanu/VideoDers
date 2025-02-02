package d09forloops;

import java.util.Scanner;

public class Forloop04 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin o sayidan kucuk olan tum
         pozitif sayilari buyukten kucuge dogru ayni satirda
          aralarinda bosluk olacak sekilde yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num = scan.nextInt();

        if(num>0){
            for(int i = num; i>0; i--){
                if(i%2 ==1){
                    System.out.print(i + " ");
                }
            }
            }else{
            System.out.println("pozitif sayi giriniz");
        }
    }
}

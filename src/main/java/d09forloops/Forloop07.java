package d09forloops;

import java.util.Scanner;

public class Forloop07 {
    public static void main(String[] args) {
        /*
        Baslangic ve bitis degerlerini kullanicidan alin 
        Baslangic degerinden bitis degerine kadar tum tam sayilarin toplamini
        yazdyran kodu yaziniz
        
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("baslangic degeri giriniz");
        int bas = scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bitis = scan.nextInt();
        
        int toplam = 0;
        if(bas> bitis){
            System.out.println("Bitis degeri baslangic degerinden buyuk olmali");
        } else{
            for(int i = bas; i<=bitis; i++){
                toplam = toplam +i;
            }
            System.out.println("toplam = " + toplam);
        }
    }
}

package d06if;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        /* Kullanicidan bir karekter alin
        Bu character buyuk harf ise "Buyuk harf" yazdirin
        Bu character kucuk harf ise "Kucuk harf" yazdirin
        Bu character  harf degil  ise "Harf degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir character giriniz");
        char ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        }
        if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')){
            System.out.println("Harf degildir");
        }
        scan.close();
    }
}
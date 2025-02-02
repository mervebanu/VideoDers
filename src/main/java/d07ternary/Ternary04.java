package d07ternary;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        /* Kullanicidan bir tamsayi girmesini isteyin
        o tamsayi uc basamakli ise ekrana uc basamakli yazdirin
        3 basamakli degilse cift olup olmadigini kontrol edin
        Cift ise 3 basamakli olmayan cift sayi yazdirin
        Cift sayi degilse 3 basamakli olmayan tek sayi yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int s = scan.nextInt();

        String sonuc = s>99 && s<1000 ? "Uc basamakli" :
                s %2 == 0 ? "Uc basamkli olmnayan cift sayi": "Uc basamakli olmayan tek sayi";
        System.out.println(sonuc);
    }
}

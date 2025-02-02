package d10stringmethods;

import java.util.Scanner;

public class StringOrnek06 {
    public static void main(String[] args) {
        /*
        1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz
        2) Kullanici ad ve soyadini yazarken hatayla ba;a ve sona space koyarsa siliniz
        3) Ad ve sayadin ilk harfleri buyuk diger harfleri kucuk olmali
        4) Kimlik numarasinin son dort rakami haric hepsi yildiz yapilmali
        Ornek : Ali Can  *******9864 gibi
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = scan.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.nextLine();
        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNo = scan.nextLine();

       // 2) Kullanici ad ve soyadini yazarken hatayla basa ve sona space koyarsa silinz
        ad = ad.trim();
        soyad = soyad.trim();

        //  3) Ad ve sayadin ilk harfleri buyuk diger harfleri kucuk olmali
        ad = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase();
        System.out.println(ad);
        soyad = soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println(soyad);

        // 4) Kimlik numarasinin son dort rakami haric hepsi yildiz yapilmali
       kimlikNo =  "*******" + kimlikNo.substring(kimlikNo.length()-1);
        System.out.println(kimlikNo);





    }
}

package d04scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

         /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.
        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın

        Example 1:
        From the user;
        i) Name and Surname ii) Age
        iii)Height
        iv) Weight
        v) Ask him to enter his marital status.

        Then print them on separate lines in the console with a label*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi ve soyadinizi giriniz");
        //nextLine() methodu ile birden fazla kelime girisi alabilirsiniz
        String fullName = scan.nextLine();

        System.out.println("yasinizi giriniz");
        byte age = scan.nextByte();

        System.out.println("boyunuzu giriniz");
        float height = scan.nextFloat();

        System.out.println("Kilonoz giriniz");
        short weight = scan.nextShort();

        System.out.println("medeni durumunuzu giriniz");
        //next() methodu ile tek kelimeli String girisi alabilirsiniz
        String maritalStatus = scan.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

    }
}

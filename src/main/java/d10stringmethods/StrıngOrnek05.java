package d10stringmethods;

import java.util.Scanner;

public class StrıngOrnek05 {
    public static void main(String[] args) {
        /*
       1 kullanicidan password aliniz
       2) Password a) ilk karakter buyuk harf olacak
                   b) son karakter sayi olacak
                   c) en az 6 karakter uzunlugunda olacak
       sartlarini sagliyorsa ekrana "password basariyla olusturuldu" yaziniz
       3) password yukaridaki sartlardan herhangi birini saglamiyorsa "tekrar
       deneyiniz" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("passwordunuzu giriniz");
        String pwd = scan.nextLine();

       if((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') &&
               (pwd.charAt(pwd.length()-1) >='0' && pwd.charAt(pwd.length()-1) <='9') &&
               pwd.length()>=5)
                {
            System.out.println("Password basariyla olusturuldu.");

       } else{
            System.out.println("Tekrar deneyiniz");
       }

       scan.close();
    }
}

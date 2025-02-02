package d06if;

import java.util.Scanner;

public class NestedIfSoru02 {
    public static void main(String[] args) {
        /* Kullanicidan bir harf girmesini isteyin

        Girdigi harf kucuk harf ise harfin "a" olup olmadigini kontrol edin.
        Harf  "a" ise ekrana ilk kucuk harf yazdirin.
        "a" degil ise ilk kucuk harf degil yazdirin

         Girdigi harf buyuk harf ise harfin "Z" olup olmadigini kontrol edin.
        Harf  "Z" ise ekrana son buyuk harf yazdirin.
        "Z" degil ise son buyuk harf degil yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);


              if(harf >='a'&& harf <= 'z') {
                  if(harf == 'a'){
                      System.out.println("ilk kucuk harf");
                  } else{
                      System.out.println("ilk kucuk harf degil");
                  }
              }else if(harf >='A'&& harf <= 'Z'){
                     if(harf =='Z') {
                         System.out.println("son buyuk harf");
                     }  else{
                         System.out.println("son buyuk harf degil");
                     }
            } else {
                  System.out.println("Lutfen harf giriniz");
              }
              scan.close();
    }
}

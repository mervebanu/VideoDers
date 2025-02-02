package d10stringmethods;

import java.util.Scanner;

public class StringOrnek07 {
    public static void main(String[] args) {
      /*
      1) Kullanicidan bir string alin
      2) Tum rakamlari * a cevirin
      3) Bas ve sondaki tum spaceleri silin
      4) Aralardaki tum spaceleri ! isaretine cevirin
      5) a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
      6) En basa ve en sona "(" ve en sona ")" ekleyin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String s = scan.nextLine();

        //2) Tum rakamlari * a cevirin
        s = s.replaceAll("\\d", "*");

        // 3) Bas ve sondaki tum spaceleri silin
        s = s.trim();

        // 4) Aralardaki tum spaceleri ! isaretine cevirin
       s =  s.replace(" ", "!");

       //5) a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
        s = s.toLowerCase();
        s  = s.replace("a","A");
       s =  s.replace("z", "Z");

       //6) En basa ve en sona "(" ve en sona ")" ekleyin
       s =  "(" + s + ")";


     scan.close();

    }
}

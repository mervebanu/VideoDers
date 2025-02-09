package d19arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

    public static void main(String[] args) {
        /*
        Kullanicidan tam ismini alin
        Isminin harflerini bir listeye ekleyin
        Harflerei alfabet'k sirada buyuk harfler olarak yazdirin
        Harfleri alfabetik siranin tersinde buyuk harf olarak yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String name = scan.nextLine().replace(" ","").toUpperCase();
        List<Character> harfler = new ArrayList<>();



        for (int i = 0; i < name.length(); i++) {
          harfler.add(name.charAt(i));

        }
        System.out.println(harfler);
        Collections.sort(harfler);
        System.out.println(harfler);
        Collections.reverse(harfler);
        System.out.println(harfler);

    }
}

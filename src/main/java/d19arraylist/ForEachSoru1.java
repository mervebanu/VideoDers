package d19arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachSoru1 {

    static int no = 1000;

    public static void main(String[] args) {

        /*
        Giris yilini, ad ve soyad bilgilerini kullanicidan aliniz
        Giris Yili + Ad ve soyadinin ilk harfleri  + Sirs numarasi seklinde ogrenci numarasi
        olusturan programi yaziniz

         */

        Scanner scan = new Scanner(System.in);

        int yil = 0;
        String isim = "";
       List<String> isimler = new ArrayList<>();
       List<Integer> yillar = new ArrayList<>();
        do{

            System.out.println("Universite Giris yilinizi giriniz");
             yil = scan.nextInt();
            yillar.add(yil);
            scan.nextLine();

            System.out.println("Ad ve soyadinizi giriniz");
            isim = scan.nextLine().toUpperCase();
            if(!isim.equalsIgnoreCase("X")){
                isimler.add(isim);
            }

        }while(!isim.equalsIgnoreCase("X"));

        System.out.println(isimler);
        System.out.println(yillar);

        for (String w :isimler){
            System.out.println(w + "id" + 20+ "" + w.charAt(0) + w.charAt(w.indexOf(" ")+1)+ no);
            no++;
        }

    }

}

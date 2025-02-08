package d19arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {

    public static void main(String[] args) {

        List<String> sl = new ArrayList<>();
        sl.add("Ali");
        sl.add("Kemal");
        sl.add("Ayse");

        //Bir elemani degistirme
        sl.set(0,"Aliye");
        System.out.println(sl); //[Aliye, Kemal, Ayse]

        //Bir elemanin varligi nasil kontrol edilir
        System.out.println(sl.contains("Kemal")); //treu
        System.out.println(sl.contains("xvz")); //false

        //Elemanlari natural order a gore nasil dizeriz(Kucukten buyuge, alfabetik siralama)
        Collections.sort(sl); //==> Cok kullanilir
        System.out.println(sl); //[Aliye, Ayse, Kemal]

        //Elemanlari natural order in tersine gore siralama
        Collections.reverse(sl);
        System.out.println(sl); //[Kemal, Ayse, Aliye]

        //List deki elemanlarin tamamini nasil sileriz
        sl.clear();
        System.out.println(sl); //[]

        //Iki list in esit olup olmadigini nasil kontrol ederiz
        /*
        Her primitive data type nin bir wrapper Class i vardir
        boolea ==> Boolean
        char ==> Character
        byte ==> Byte
        shor ==> Short
        int ==> Integer
        long ==> Long
        float ==> Float
        double ==> Double
         */

        //Iki list in esit olup olmadigini nasil kontrol ederiz
        List<Integer> il1 = new ArrayList<>();
        il1.add(12);
        il1.add(13);
        il1.add(14);

        List<Integer> il2 = new ArrayList<>();
        il2.add(12);
        il2.add(13);
        il2.add(14);

        System.out.println(il1.equals(il2)); //Esitse true
        // hem elemanlari hem de elemanlarin yerlerini kontrol eder

    }

}

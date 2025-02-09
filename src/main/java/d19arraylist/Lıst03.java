package d19arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lıst03 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        // List eleman eklemnin iki yolu vardir
        ls.add("B");
        ls.add("A");
        ls.add("M");
        ls.add(1,"K");
        ls.add(0,"S");
        ls.add("T");
        ls.add("B");
        System.out.println(ls);

        // List in icindeki eleman sayisini bulmak
        // Array'lerin eleman saysindan bahsederken Array in length'i deyiniz
        //Listlerin eleman sayisindan bahsederken "List in Size'i " deyiniz
        System.out.println(ls.size());

        //Bir list'in bos olup olmadigini kontrol etmek
        System.out.println(ls.isEmpty());

        //Bir list ten index kullanarak eleman silmek
        //index kullanarak remove metodunu kullanirsaniz ve ekrana yazdirirsaniz java
        //sildigi elemani ekrana yazar
        System.out.println(ls.remove(2));
        System.out.println(ls);

        //Bir listten eleman ismi ile eleman silmek
        System.out.println(ls.remove("M"));
        System.out.println(ls);


    }
}

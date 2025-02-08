package d19arraylist;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    /*
    Array lerin uzunluklari en basta belilenir ve bir daha degistirilemez.
    List(ArrayList)'lerde ise list olusturulurken uzunluk belirlemeye gerek yoktur. Cunku
    list'ler eleman eklendikce kendilerine buyuturler. Elemen silindikce kendilerini kuculturler.
    2)Listler cok kullanislimethodlara sahiptir. Bu yuzden Arral'lere tercih edilir.
    3) Array ler primitive ve referance lari eleman olarak kabul ederler
    Ama List ler sadece non-primitive'leri eleman olarak kabul eder.
     */

    public static void main(String[] args) {

        //List Olusturma
        //1. yol
        ArrayList<String> sl = new ArrayList<String>();
        //2. yol
        ArrayList<String> sl1 = new ArrayList<>();
        //3. yol
        List<String> sl2 = new ArrayList<>();
        System.out.println(sl2); //[]

        sl2.add("Ali");
        sl2.add("Banu");
        sl2.add("merve");
        System.out.println(sl2); //[Ali, Banu, merve]

        // Herhangi bir index e eleman ekleme
        sl2.add(1,"can");
        System.out.println(sl2); //[Ali, can, Banu, merve]

        //List'lerde eleman sayisi bulma nasil yapilir
        System.out.println(sl2.size());//4

        // Bir list'in bos olup olmadigini nasil anlariz
        System.out.println(sl2.isEmpty()); //false // Bos ise true, dolu ise false

        //Bir list'den istenen elemani silme

        //1. yol index ile silme
        System.out.println(sl2.remove(0));

        //2. yol eleman secip silebiliriz
        sl2.remove("merve");
        System.out.println(sl2);
        sl2.add("Banu");
        System.out.println(sl2); // [can, Banu, Banu]

        //javada listede olmayan bir elemani remove etmek isterseniz silemez ve list'i
        // aynen oldugu gibi birakir
        System.out.println(sl2.remove("ayse"));
        System.out.println(sl2); //[can, Banu, Banu]


    }
}

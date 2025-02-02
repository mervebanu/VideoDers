package d17arrays;

import java.util.Arrays;

public class Arrays01 {

    int x =12;
    /*
    1) Array'ler birden fazla degeri depolamak icin kullanilabilir
    2) Array'lere konulan degerlerin data tiplaeri ayni olmalidir
    3) Array olustururken mutlaka kac eleman yerlestireecegimizi belirtmemiz gerekir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.

     */

    public static void main(String[] args) {


        // Array olusturmak

        String[] stdNames1 = new String[3];
        //String stdNames[] = new String[4];

        //System.out.println(stdNames1); //Array ler bu sekilde yazdirilamaz
        System.out.println(Arrays.toString(stdNames1)); //[null,null,null]

        //ornek 1: 5 elemanli notes adinda, int bir array olusturunuz ve console'a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0,0,0,0,0]

        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers)); //[null, null, null, null, null, null, null, null, null, null]

        //---------------------------------
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); // [null, null, null]

        //Array'e eleman eklemek
        //index mantigiyla ekleniyor. 0 ilk index demektir

        names[0] = "ali can";
        names[2] = "Veli Han";
        names[1] = "Ayse Hanim";
        // names[3] = "Hasan Kaya" HATA, 3. index yok
        System.out.println(Arrays.toString(names)); //[ali can, Ayse Hanim, Veli Han]

        // Bir veriyi gormek icin
        System.out.println(names[1]); //Ayse Hanim

        names[0] = "Omer Can";
        System.out.println(Arrays.toString(names)); //[Omer Can, Ayse Hanim, Veli Han]

        //-------------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        // 1. yol : for loop
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) {

            totalChar = totalChar + cities[i].length();
        }
        System.out.println(totalChar);

        //2. yol:
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w'nun kullanilmasidir.

        /*
        for (DataType variable : array yada collection){
            calisacak kodlar
        }
         */

        int sum = 0;

        for (String w : cities){
           sum = sum +w.length();
        }
        System.out.println(sum);












    }


}

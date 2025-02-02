package d1variables;

public class Variables02 {
    public static void main(String[] args) {
        // Varaible olusturma
        // 1) Dta type yaz 2) Variable ismi yaz 3) "=" koy 4) Variable deger yaz 5) " ; " koy

        // 1. yol
        int age = 23;
        int weight = 65;
        System.out.println(age);
        System.out.println(weight);

        //2. yol
        int length; // variable olusturuldu ===> Decleration
        length = 12; // variable a deger atamasi yapildi ===> Assignment

        // 3. yol
       /* int width = 22;
        int height = 32;
        int money = 42; */

        int width =22, height = 32, money = 42;


        /* Java da temelde iki tip data type vardir.
           1) Primitive data type : 8 tanedir
             a) boolean : true veya false durumlarda kullanilir
                         boolean lar sadece 2 farkli deger alabildigi icin memoryde az yer kaplar
             b) char : Tek character li ifadeler icin kullanilir
                       Bir char memory de 16 bitlik yer kaplar
                       Char data tipinde variable olusturulurken deger mutlaka tek tirnak icine konulmalidir
             c) byte : =128 den 127 ye kadar tum tamsayilari icerir
         */

        // bit memory in en kucuk yapi tasidir.
        //byte : 8 bit bir byte olarak adlandirilir

        // boolean
        boolean emekli = false;
        boolean engelli = true;

        // char
        char initial = 'S';
        char ch1 = '?';
        char ch2 = 'a';
        char ch3 = ' '; // space bir karakterdir ve char olarak kullanilabilir
        System.out.println(initial);
        System.out.println(ch1 + ch2); // 160
        char ch5  = 'A';

        System.out.println(ch5 > ch2);

        // Herhangi bir char in ASCII degerini kod yazarak bulmak
        System.out.println(ch3 + 0);

        // byte
        byte b1 = 12;

        float f1 = 2.23F;
        float f2 = 0.1234f;

        double d1 = 2.23;

        // Primitive data tiplerini buyukten kucuge siralayalim
        // byte < short < int < long < float < double


    }
}

package d10stringmethods;

public class Strıng03 {
    public static void main(String[] args) {

        // 9. isEmpty()
        // bu metotdan true aliyorsaniz o stringin icinde hicbir karakter yok
        // demektir yani o stringin length i sifirdir demektir/
        String s3 = "Tekrar et tekrar unutma";
        System.out.println(s3.isEmpty()); // false
        System.out.println("".isEmpty()); // true

        //10.
        System.out.println(s3.lastIndexOf('e')); //11
        System.out.println(s3.lastIndexOf("rar"));// 13
        System.out.println(s3.lastIndexOf('r',16));//15

        //11. length() metodu bir string deki karakterlerin sayisini verir
        System.out.println(s3.length());//23

        //12. replace() metodu
        System.out.println(s3.replace('e','E'));//TEkrar Et tEkrar unutma
        System.out.println(s3.replace('x','M')); // Degisiklik yapmaz
        System.out.println(s3.replace("krar","miz"));//Temiz et temiz unutma
        System.out.println(s3.replace("a",""));//Tekrr et tekrr unutm
        System.out.println(s3.replace("","|"));// |T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|

        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.
        String s = "learn java earn money";
        String s1 = s.replace("money", "dolar");
        System.out.println(s1); // learn java earn dolar

        //.........................
        //Ornek 2: “s” String’indeki tum “e” harflerini siliniz.
        //Example 2: Delete all “e” letters in the string “s”.

        String s2 = s.replace("e","");
        System.out.println(s2);

        //13. repraceAll()
        String s4 = "Code1 yazilarak2 ogrenilir3_";

        /*
        Regular Expression(regex): Belli turdeki karakterleri secebilmemize yarar
        1) \\d ===> tum rakamlari kasteder
         \\D ===> Tum rakam disi karakterler

        2) \\ w ===> A-->Z a-->z  0-->9
           \\ W ===> A-->Z a-->z  0-->9 _ disindaki hersey

         3) \\s ===> space
            \\ S ===> space disindakiler
         */
        System.out.println(s4.replaceAll("\\d","*"));
        System.out.println(s4.replaceAll("\\D","*")); // Rakam disindakileri degistirir
        System.out.println(s4.replaceAll("\\w","*")); // ***** ******* *********
        System.out.println(s4.replaceAll("\\W","*")); // Code1*yazilarak2*ogrenilir3_
        System.out.println(s4.replaceAll("\\s","*")); // Code1*yazilarak2*ogrenilir3_
        System.out.println(s4.replaceAll("\\S","*")); // ***** ********** ***********

        //14. startWith()
        System.out.println(s4.startsWith("C")); // true
        System.out.println(s4.startsWith("Code"));// true

        // s4 stringinin 4. karakteri "e" mi
        System.out.println(s4.startsWith("e",3));// true

        //.......................
        //Ornek 1: s String'indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz.
        //Example 1: Convert all digits (0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9) in String s to "*"

        String st = "Learn Java earn 1234 money";
        System.out.println(st.replaceAll("[0-9]","*"));
        System.out.println(st.replaceAll("\\d","*"));

        //......................
        //Ornek 2: “s” String’indeki rakam sayisini bulunuz.
        //Example 2: Find the number of digits in String “s”

        int num = st.replaceAll("[^0-9]","").length();
        System.out.println(num);
        System.out.println(st.replaceAll("\\D","").length());
    }
}

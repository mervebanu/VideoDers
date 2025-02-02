package d10stringmethods;

public class Strıng04 {
    public static void main(String[] args) {

        // 15. substring() Metodu
        String s1 = "Java OOP language oldugu icin populerdir";
        System.out.println(s1.substring(3)); // a OOP languagedir.

        // OOP languagedir. ekrana yazdirin
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0));

        // Son harfi ekrana yazdirin
        System.out.println(s1.substring(s1.length()-1));

        System.out.println(s1.substring(9,17)); // [9,17)
        // substring[0,1) String deki ilk harfi verir
        System.out.println(s1.substring(0,1));
        // substring(0,1); String return eder , charAt(0,1) char return eder

        s1.substring(5,5); // Index ler esit ise hicbirsey alirsiniz

        // substring metodunda baslangic indexi bitis index inden buyuk
        // olamaz. Buyuk olursa run time error alirsiniz
       // s1.substring(5,2);

        //16. trim()
        String s2 = "   Java ogrenen diger dilleri cabucak ogrenir     ";
        // trim() metodu bir stringin bas ve sonundaki space leri siler
        // Stringin icindeki space leri silmez
        
        System.out.println("Trim kullandiktan sonra" + s2.trim());

           //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
                  //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
                //Example 1: Find the total price of the following products.
                //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
                String tv = "$456.99";
                String laptop = "$875.99";

                 tv = tv.replace("$","");
                 laptop = laptop.replace("$","");

                 Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);
        //.................................
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String name = "   ali    cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char  last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(last);

        System.out.println("" + first + last);






    }
}

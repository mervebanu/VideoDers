package d10stringmethods;

public class String02 {
    public static void main(String[] args) {
        //4.endsWith() ===> String ile calisir/ Char kabul etmez
        String s1 = "Testi al kendini gor";
        System.out.println(s1.endsWith("r")); //true
        System.out.println(s1.endsWith("gor")); // true
        System.out.println(s1.endsWith("")); //true

        // 5. equals()
        System.out.println("Ali".equals("Ali"));// true
        System.out.println("Ali".equals("ALI"));// false
        System.out.println("Ali" == "Ali"); // true

        //6. equalsIgnoreCase()
        System.out.println("Ali".equalsIgnoreCase("Ali")); //true

        //7. indexOf()  metodu index i sorulan char in stringin icindeki
        // ilk gorunumunun index ini return eder

        // index Of() metodunda hem char hem de string kullanilabilir.
        // index Of() metodunda birden fazla characterin index i sorulursa
        // ilk karakterin indexi return edilir

        // String s1 = "Testi al kendini gor";
        System.out.println(s1.indexOf('i')); // 4
        // ilk i harfinin index ini yollar
        System.out.println(s1.indexOf(' ')); //5
        System.out.println(s1.indexOf("al")); // 6

        // indexOf() metodu olmayan karakterler icin -1 return eder
        System.out.println(s1.indexOf('x')); // -1
        System.out.println(s1.indexOf("")); // 0 verir hiclikde

        // 8.
        String s2 = "Cabuk ogrenen cabuk unutur";

        System.out.println(s2.indexOf('a',6)); //15
              // 6. index den sonraki a harfinin index ini dondurur.
        System.out.println(s2.indexOf('r',8));// 8

        System.out.println(s2.indexOf("buk", 5)); //16

    }
}

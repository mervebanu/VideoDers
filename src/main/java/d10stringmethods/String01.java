package d10stringmethods;

public class String01 {
    public static void main(String[] args) {

        // 1. charAt()
        String s1 = "study hard stay humble";

        System.out.println(s1.charAt(0)); //s

        //7. karakteri ekrana yazdiriniz
        System.out.println(s1.charAt(6)); //h

        //son karakteri ekrana yazdiriniz
        System.out.println(s1.charAt(s1.length() - 1));

        // Ortdaki karakteri ekrana yazdiriniz
        if (s1.length() % 2 != 0) {
            System.out.println(s1.charAt((s1.length() - 1) / 2));
        } else {
            System.out.println("orta karakter yok");
        }
        // charAt() metodunda olmayan bir index kullaniginizda programi calistirdiktan sonra ekranda
        // kirmizi hata mesaji alirsiniz
        // System.out.println(s1.charAt(38)); // hata verir string in son indexi 21

        /*
        Javada temel de iki tur hata vardir;
        1) Compile time error : Kod yazarken alinan kirmizi alt cizgiler
        2) Run time error: Yazilan kod calistirildigindan sonra consol da gozuken kirmizi mesajlar
                           Run time error olustugunda sonraki kodlar calistirilmaz. Java kod
                           calistirmayi (execution) durdurur.
         */

        // 2. concat()
        String s2 = "Ogreten ogrenir";
        // String metodlari gecici degisiklik yapar. Orjinal string degismez
        System.out.println(s2.concat(" tamam mi")); // Ogreten ogretir tamam mi

        System.out.println(s2); // Ogreten ogretir

        // 3. contains()
        String s3 = "Java ogren zengin ol";
        // Contains metodu boolean return eder.
        System.out.println(s3.contains("J"));
        System.out.println(s3.contains("x"));
        System.out.println(s3.contains("ogren")); //true
        System.out.println(s3.contains("Zengin")); // false
        System.out.println(s3.contains("")); // true


    }
}
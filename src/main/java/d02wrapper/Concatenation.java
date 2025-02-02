package d02wrapper;

public class Concatenation {
    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile Integer'larin toplamini console'a yazdirin.
        //Example 1: Create a String and two int variables. Print the string value and the sum of the Integers to the console.

        int a = 12;
        int b = 25;
        String st = "Banu";

        System.out.println(st + a + b); // Banu1225
        System.out.println(st + (a + b)); // Banu37
        System.out.println(st + a * b); // Banu300
        System.out.println(a+b+st); //37Banu

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir

    }
}

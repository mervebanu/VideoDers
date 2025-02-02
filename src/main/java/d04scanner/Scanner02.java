package d04scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        // Dta tipi string oldugu zaman nextline() metodu kullanilir
        // Data types string oldugu zaman sadece next() metoduda kullanilablir
        // ama next() metodu sadece ilk kelimeyi alir devamini almaz
        String name = scan.nextLine();
        System.out.println(name);

    }
}

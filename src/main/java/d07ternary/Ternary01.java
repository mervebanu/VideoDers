package d07ternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        // condition ? true   :  false

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = scan.nextInt();

        if (s > 9) {
            System.out.println("Rakam degil");
        } else {
            System.out.println("Rakam");
        }

        String result = s>9 ? "Rakam degil" : "rakam" ;
        System.out.println(result);

        System.out.println(s>99 && s<1000 ? "3 basamakli" : s);

    }
}
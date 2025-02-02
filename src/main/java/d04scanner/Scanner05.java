package d04scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        /* kullanicidan bir dikdortgenin uzun ve kisa kenarlarini alip
        o dikdortgenin alan ve cevresini hesaplayip ekrana yzdiran
        programi olusturunuz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double kisa = scan.nextDouble();

        System.out.println("Dikdortgenin uzun kenarini giriniz");
        double uzun = scan.nextDouble();

        double cevre = 2 * (uzun + kisa);
        double alan = uzun * kisa;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

        scan.close();
    }
}

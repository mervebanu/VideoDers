package d07ternary;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
       /* Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        Iki kenar uzunlugu birbirine esit ise ikizkener ucgen yazdirin
        Diger durumlarda ekrana ikizkenar deil yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();

        String result = k1==k2 || k2==k3 || k1==k3 ?
                "ikizkenar ucgen" : "Ikizkenar degikl";
    }
}

package d11whileloop;

import java.util.Scanner;

public class Whileloop02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz bu sayi icin carpim tablosunu olusturunuz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("carpim tablosu olusturmak icin bir sayi giriniz");
        int s= scan.nextInt();

        int i=1;
        while (i<=10){
            System.out.println(s + "x" + i + "=" + s*i);
            i++;
        }
    }
}

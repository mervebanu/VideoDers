package d09forloops;

import java.util.Scanner;

public class Forloop12 {
    public static void main(String[] args) {
        /*
        for loop kullanarak asagida verilen sekli olusturunuz
                             *
                            * *
                           * * *
                          * * * *
                         * * * * *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacak ucgenin satir sayisini giriniz");
        int s = scan.nextInt();

        for(int i=1; i<=s; i++){ // satirlar icin
            // Space^ ler icin loop
            for(int k=s-1; k>=i; k--){
                System.out.print(" ");
            }
            // * lar icin for loop
            for(int m=1; m<=i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

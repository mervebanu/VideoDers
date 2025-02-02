package d09forloops;

import java.util.Scanner;

public class forloop13 {
    public static void main(String[] args) {
        /*
        Satir sayisini kullanicidan alarak asagidaki sekil gibi sekil
        olusturunuz
                         * * * * *
                          * * * *
                           * * *
                            * *
                             *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int s = scan.nextInt();

        for (int i = 1; i < s; i++) {

            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= s - i; k++) {
                    System.out.print("*" + " ");
                }


                System.out.println();
            }


        }
    }

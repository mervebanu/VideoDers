package d11whileloop;

import java.util.Scanner;

public class Forloop01 {
    public static void main(String[] args) {
        /*
        Satir sayisini kullanicidan alarak asagidaki gibi sekil olusturunuz
                    *******
                     *****
                      ***
                       *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int s = scan.nextInt();

        for (int i = 0; i <= s ; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <2*(s-i) ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        }
    }


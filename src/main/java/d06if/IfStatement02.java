package d06if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        //Example 1: Create the code that prints whether a number received from the user is odd or even.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println("sayi cifttir");
        }
        if(num % 2 !=0){
            System.out.println("sayi tekdir");
        }

        // 2. yol ..............
        //if - else Statements

        /* if () {

        } else {

        } */

        if(num % 2 == 0){
            System.out.println("cift sayi");
        } else{
            System.out.println("tek sayi");
        }

    }
}

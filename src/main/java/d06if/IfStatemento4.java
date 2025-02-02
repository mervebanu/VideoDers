package d06if;

import java.util.Scanner;

public class IfStatemento4 {
    public static void main(String[] args) {

        //if - else if - else Statements

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        //Example 1: Write the code that checks whether a number received from the user is positive, negative or neutral

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = scan.nextInt();

        if(num > 0){
            System.out.println("Sayi pozitiftir");
        } else if(num <0){
            System.out.println("Sayi negatiftir");
        } else {
            System.out.println("sayi notrdur");
        }

    }
}

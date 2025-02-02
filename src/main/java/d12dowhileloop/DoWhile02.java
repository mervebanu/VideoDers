package d12dowhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

        /*
        Kullanicidan sayi aliniz.
        Sayi 10 dan kucuk isee ekrana kazandiniz yazdirin
        Sayi 10 veya 10 dan buyukse ekrana "Sayi giriniz" yazdirin
         */
        Scanner scan = new Scanner(System.in);

        int sayi= 0;
        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();


        }while(sayi>9);
        System.out.println("Kazandiniz");
    }
}

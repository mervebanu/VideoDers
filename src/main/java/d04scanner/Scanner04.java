package d04scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Alfabeden bir harf gir");
        // Kullanicidan aldiginiz data type char ise asagidaki kodu yaziniz
        char harf = scan.next().charAt(0);
        System.out.println(harf);

    }
}

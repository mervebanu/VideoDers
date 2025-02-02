package d09forloops;

import java.util.Scanner;

public class Forloop14 {
    public static void main(String[] args) {
        /*
        kullanicidan bir string aliniz ve o stringin tersini
        ekrana yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String st = scan.nextLine();

        for(int i= st.length()-1; i>=0; i--){

            System.out.print(st.charAt(i));
        }
        scan.close();
    }
}

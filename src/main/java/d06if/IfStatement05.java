package d06if;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
        1==> Pazar, 2 ==> Pazartesi …*

        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
        1==> Sunday, 2 ==> Monday …*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");

        int num = scan.nextInt();

        if(num <=0){
            System.out.println("Gun sayilari birden kucuk olamaz");
        } else if (num == 1) {
            System.out.println("Pazar");
        } else if (num == 2) {
            System.out.println("Pazartesi");
        } else if (num == 3) {
            System.out.println("Sali");

        }else if (num == 4) {
            System.out.println("Carsamba");
        }else if (num == 5) {
            System.out.println("persembe");
        }else if (num == 6) {
            System.out.println("Cuma");
        }else if (num == 7) {
            System.out.println("Cumartesi");
        }else  {
            System.out.println("Gun sayilari 7 den buyuk olamaz");
        }
    }
}

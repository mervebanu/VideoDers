package d08switch;

import java.util.Scanner;

public class Switch05 {
    public static void main(String[] args) {
        /* kullanici ay ismini girdiginde kac gun oldugunu yazdiriniz

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("ay ismini giriniz");
        String month = scan.nextLine().toLowerCase();

        Object dayOfMonth = switch (month){
            case "ocak","mart","mayis","temmuz",
                 "agustos","ekim","aralik" -> 31;
            case "haziran","nisan",
                 "eylul","kasim" -> 30;
            case "subat" ->"28 veya 29";
            default -> "gecerli bir ay ismi giriniz";
        };
        System.out.println("dayOfMonth = " + dayOfMonth);
    }
}

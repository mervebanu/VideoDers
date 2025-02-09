package d19arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List04 {

    public static void main(String[] args) {
         /*
    //Elemanlarini kullanicinin girdigi bir string olusturunuz.Elamalarin tamamami rakamlardan olussun
    2) Bu listin elemanlarin carpini ekrana yazdiriniz
     */

        Scanner scan = new Scanner(System.in);
       String str = " ";
       List<String> list = new ArrayList<>();

       do{
           System.out.println("Rakamlardan olusan String ler giriniz");
           System.out.println("String girmeyi durdurmak icin s giriniz");
           str = scan.next();
           if(!str.equals("s")){
               list.add(str);
           }

       }while(!str.equals("s"));
        System.out.println(list);

        int carpim=1;
        for (int i = 0; i < list.size(); i++) {
          carpim = carpim *Integer.parseInt(list.get(i));
        }
        System.out.println(carpim);
    }


}

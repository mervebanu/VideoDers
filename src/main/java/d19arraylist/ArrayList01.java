package d19arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
 /*
 1) List ler primitive data type'larini kabul etmez. Primitive data typleari yerine wrapper classlari kullnair
  */

    public static void main(String[] args) {
        // ArrayList  olusturma

        //1. yol
        //ArrayList<Integer> list1 = new ArrayList<Integer>();
        //2. yol
        //ArrayList<Integer> list1 = new ArrayList<>();

        // 3. yol:Recommended
        List<Integer> list3 = new ArrayList<>();

        //Listleri consola yazdirmak
        System.out.println(list3);

        //Lis'e eleman ekleme
        list3.add(12);
        list3.add(13);
        System.out.println(list3); //[12,13]

    }
}

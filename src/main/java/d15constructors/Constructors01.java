package d15constructors;

import java.util.Scanner;
import java.util.Set;

public class Constructors01 {
     /*
        1) Constructor'in ismi class ismi ile ayni olmalidir.
        2) Constructor olusturulurken class ismi yazildiktan sonra () konulmalidir
        3) Class olusturuldugunda Java bu class dan object olusturulacagini dusunrerek "constructor" olusturur.
          Bu constructor a 'default constructor' denir
        4) Sis kendiniz constructor urettiginiz de Java default constructor u siler
        5) Constructor ureterek bir class dan cok farkli object'ler uretebiliriz.
        6) Constructorlarda return type yoktur. Bu yuzden constructorlar method degildirler

         */

    public Constructors01(){
        // Kendimiz constructor urettik
    }


    public static void main(String[] args) {


       // Class ismi      object ismi     new keyword    Constructor
        Scanner            scan         =   new          Scanner(System.in);

        Constructors01 obj1 = new Constructors01();
    }

}

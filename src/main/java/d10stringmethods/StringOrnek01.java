package d10stringmethods;

import java.util.Scanner;

public class StringOrnek01 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        //............................
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = scan.nextLine();

        //En az 8 karakter olsun
        boolean lengthControl = pwd.length() >7;
        //System.out.println("lengthControl = " + lengthControl);

        //Space karakteri password'de olmasin
        //boolean spaceControl = pwd.replaceAll("[^ ]","" ).length() == 0;
        //boolean spaceControl = pwd.replaceAll("[^ ]","" ).isEmpty();boolean spaceControl = !pwd.contains(" ");
            boolean spaceControl = !pwd.contains(" ");
       // System.out.println("spaceControl = " + spaceControl);

          // iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl  = pwd.replaceAll("[^A-Z]","").length()>0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

          //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
          //System.out.println("lowerCaseControl = " + lowerCaseControl);

            //v)At least one number
        boolean digitControl = pwd.replaceAll("[0-9]","").length()>0;
           //System.out.println("digitControl = " + digitControl);

        if(!digitControl)   {
                  System.out.println("Sifre en az bir rakam icermelidir.");
        }

          boolean isValid =  lengthControl &&  spaceControl && upperCaseControl && lowerCaseControl && digitControl;

          if(isValid){
              System.out.println("sifre gecerlidir");
          } else{
              System.out.println("sifre gecersizdir");
          }
    }

}

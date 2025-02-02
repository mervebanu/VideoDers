package d16staticKeyword;

public class StaticBlock {

    static double pi;
    /*
    1) Static block static variable lara deger atamsi yapmak(initialize) icin kullanilir
    2) Static block class olusturulurken butun metodlardan once calistirilir
    3) Birden fazla static block varsa ustteki obce calisir.

     */

    static {
        pi= 3.14;
    }

    public static void main(String[] args) {
        alanDaire(10);
    }

    public static void alanDaire(double r){
        System.out.println("Dairenin alani: " + pi*r*r);
    }
}

package d16staticKeyword;

public class StaticKeyWord02 {

    public static void main(String[] args) {
        // Static olanlara sadece class ismi kullanarak ulasabilirsiniz
        System.out.println(StaticKeyWord01.gender);
        System.out.println(StaticKeyWord01.k);

        // Instance olanlara ulasmak icin object uretmek zorundasiniz
        StaticKeyWord01 obj1 = new StaticKeyWord01();
        System.out.println(obj1.i);
        System.out.println(obj1.name);

        // Static olanlara object uzerinden ilasabilirsiniz ama tavsiye edilmez

    }
}

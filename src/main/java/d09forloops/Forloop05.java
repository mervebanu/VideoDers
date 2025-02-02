package d09forloops;

public class Forloop05 {
    public static void main(String[] args) {
        /*
        5 den 12 ye kadar tim sayilarin toplamini hesaplayip ekrana yazdirin
         */

        int toplam = 0;

        for(int i = 5; i<=12; i++){
            toplam = toplam + i;
        }
        System.out.println("Toplam" + toplam);

    }
}

package d09forloops;

public class Forloop06 {
    public static void main(String[] args) {
        /*
        18 den 3 e kadar tum sayilarin toplamini ekramna yazdirin

         */

        int toplam = 0;

        for(int i = 18; i>=3; i--){

            toplam = toplam +i;
        }
        System.out.println("toplam = " + toplam);

    }
}

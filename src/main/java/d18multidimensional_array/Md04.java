package d18multidimensional_array;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {
        int[][] ma = { {11,5}, {7}, {21,17,28}};

        System.out.println(Arrays.deepToString(ma));
        System.out.println(Arrays.toString(ma[2]));
        System.out.println(ma[2][1]);

        //ma multidimensional array inin tum elemanlariniu ayni satirda aralarinda bo;luk birakarak yazdiriniz
        for (int i = 0; i <ma.length; i++) {

            for (int j = 0; j <ma[i].length ; j++) {

                System.out.print(ma[i][j] + " ");
                
            }
        }

        //ma multidimentianal arrayinin tum elemanlarinin toplamini ekrana yazdiran programi yaziniz

        System.out.println("----------------");
        int toplam =0;

        for (int[] w: ma){
            for (int k : w){
                toplam = toplam + k;
            }

        }
        System.out.println(toplam);

    }
}

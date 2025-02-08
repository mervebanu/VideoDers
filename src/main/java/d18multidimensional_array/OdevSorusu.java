package d18multidimensional_array;

import java.util.Arrays;

public class OdevSorusu {
    public static void main(String[] args) {
        /*
        Asagidaki multidimensinal Array in ic arraylarin deki tum elemanlarin toplamini bulan ve her bir
        sonucu yeni bir Array in elemani yapan ve yeni array i ekrana yazdiran bir program yzainiz
        Ornegin: { {1,2,3}, {4,5}, {6,7}}
         */

        int[][] arr = {{1,2,3}, {4,5}, {6,7,20}};

        int toplam =0;
        int idx=0;

        int[] sum = new int[3];

        for (int[] w : arr){
            for (int k :w){
                toplam = toplam + k;

            }
            sum[idx] = toplam;
            toplam=0;
            idx++;

        }

        System.out.println(Arrays.toString(sum));
    }
}

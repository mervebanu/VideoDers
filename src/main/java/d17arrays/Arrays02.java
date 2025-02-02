package d17arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements

        int[] ages = new int[6];

        ages[0] =20;
        ages[1] =23;
        ages[2] =19;
        ages[3] =44;
        ages[4] =15;
        ages[5] =32;

       //1 yol
        int min= ages[0];
        int max= ages[0];

        for (int w : ages){
            min = Math.min(min,w);
            max = Math.max(max,w);

        }
        System.out.println(min+max);

        //2. yol
        // Arrays.sort(ages); // once siralayip en kucuk ve en buyuk degeri bulabiliriz
        //System.out.println(Arrays.toString(ages)); // [15, 19, 20, 23, 32, 44]

        Arrays.sort(ages);
        System.out.println(ages[0] + ages[ages.length-1]);


    }
}

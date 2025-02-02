package d09forloops;

public class Forloop11 {
    public static void main(String[] args) {
        /*
        for loop kullanarak asagidaki sekli olusturunuz
                *
                **
                ***
                ****
                *****
         */

        for(int i=1; i<=5; i++){ //i satir sayisi
            for(int k=1; k<=i; k++){ // k yildiz sayisi
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

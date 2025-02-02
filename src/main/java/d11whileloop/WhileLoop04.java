package d11whileloop;

public class WhileLoop04 {

    public static void main(String[] args) {
        // 3 basamakli 4 ve 6 ya tam bolunebilen sayilari buyukten kucuge dogru yaziniz
        // Bu sayilarin kac tane oldugunuda ekrana yazdiriniz

        int i = 999;

        int counter = 0;

        while (i>99){

            if(i%12==0){
                System.out.print(i + " ");
                counter++;
            }
            i--;

        }
        System.out.println();
        System.out.println(counter);

    }
}

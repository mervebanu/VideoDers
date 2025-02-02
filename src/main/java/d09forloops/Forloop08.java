package d09forloops;

public class Forloop08 {
    public static void main(String[] args) {
        /*
        3 den 6 ya kadar tum tam sayilarin carpimini hesaplayan programi yaziniz
         */

        int carpim = 1;

        for(int i = 3; i<=6; i++){
            carpim = carpim * i;
        }
        System.out.println("carpim = " + carpim);
    }
}

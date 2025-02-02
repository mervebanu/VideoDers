package d12dowhileloop;

public class DoWhile01 {
    public static void main(String[] args) {

        /*
        While-Loop ile do-while loop farki
        1) While loop kullanirsaniz java once sarti kontrol eder sonra loop body si icindeki kodu calistirir.
        do-while loop kullanirsaniz java once kodu calistirir sonra sarti kontrol eder.

        2) While-loop kullanirsaniz loop body icindeki kod bazen hic calismayabilir
        Fakat do-while icindeki kod en az bir kere calisir.

        Not: do-while loop oyun programi yazmak icin uygundur
         */
        int i = 1;
        while (i<1){
            System.out.println("While loop");
            i++;
        }

        int k =1;
        do{
            System.out.println("Do while loop");
            k++;
        }while (k<1);
    }
}

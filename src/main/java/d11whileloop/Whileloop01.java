package d11whileloop;

public class Whileloop01 {
    public static void main(String[] args) {
        // for loop kullanarak s1 den 5 e kadar tamsayilari ekrana yazdirin
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        // while-loop kullanarak 1 den 5 e kadar tamsayilari yazdiriniz.

        int i=1;

        while(i<=5){
            System.out.println(i);
            i++;
        }

        //While-loop kullanarak 10 dan kucuk sayma sayilarini ayni satirda
        // aralarina bo;luk kullanarak yaziniz

        int k= 1;
        while (k<10){
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        // While-loop kullanarak  50 den kucuk cift sayilari yazdirin

        int s=1;
        while (s<50){
            if(s%2==0){
                System.out.print(s + " ");

            }
            s++;
        }

        System.out.println();
        // while-loop kullanarak "java kolaydir" stringini tersden yazdirin

        String st = "java kolaydir";
        int m = st.length()-1;

        while(m>=0){
            System.out.print(st.charAt(m));
            m--;
        }

    }
}

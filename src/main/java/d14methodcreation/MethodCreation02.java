package d14methodcreation;

public class MethodCreation02 {
    public static void main(String[] args) {

        int result1 = multiply(2,8);
        System.out.println(result1);

        int result2 = firstTwoMultiplyThirAdd(2,5,7);
        System.out.println(result2);

        print("Ali Can");


    }// main disi

    //ornek 1: Iki sayiyi carpan bir method olusturunuz.
    //example 1: Create a method that multiplies two numbers

    protected  static int multiply(int a, int b){
        return a*b;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu 3. sayi ile toplayan metodu yaziniz
        //example 2: Create a method that multiplies the
        // and adds the result with the third number.

     private static int firstTwoMultiplyThirAdd(int a, int b, int c){
        return  a*b+c;
     }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console

    public static void print(String str){
        System.out.println(str);
    }

}


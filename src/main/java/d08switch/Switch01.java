package d08switch;

public class Switch01 {
    public static void main(String[] args) {
        //switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
        //if -else if'in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
        //genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)

        /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        Sunday==>1  . . .  Saturday==>7

        1.Yol : if - else if*/

        /*Example 1: Write the code that prints the number of the day given the day name.
        Sunday==>1 . . .  Saturday==>7

        Path 1 : if - else if*/

        String dayName = "WEDnesday";

        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if(dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("wednesday")){
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("SATURDAY")) {
            System.out.println(7);
        } else   {
            System.out.println("Lutfen gecerli b'r gun giriniz");
        }


        //..............
        //2. yol
        /*        switch (variable){

            case data:
                calisacak kodlar
                break;
            case data:
                calisacak kodlar
                break;
            case data:
                calisacak kodlar
                break;
            default:
                calisacak kodlar
        }*/

        switch (dayName.toLowerCase()){

            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednasday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("gecerli bir gun adi giriniz");
        }
    }
}

package d15constructors;

public class Car {

    int price;
    int year;
    String make;
    String model;
    String color;
    boolean isDiesel;
    double km;

    public Car(int price, int year, String make, boolean isDiesel){

        this.price= price;
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
    }

    public Car(int price, int year, String make, String model, String color, boolean isDiesel, double km) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.isDiesel = isDiesel;
        this.km = km;
    }

    public static void main(String[] args) {

        Car car1 = new Car(5000,2018, "Toyota", true);
        System.out.println(car1.price); //5000
        System.out.println(car1.year); //2018
        System.out.println(car1.make); //toyota
        System.out.println(car1.isDiesel); //true

        Car car2 = new Car(20000, 2022, "audi", false);
        System.out.println(car2.price); //20000
        System.out.println(car2.year); //2022
        System.out.println(car2.make); //audi
        System.out.println(car2.isDiesel); // false

        Car car3 = new Car(15000,2020, "nissan","trail","red,",true,95000);
        System.out.println(car3.price);
        System.out.println(car3.year);
        System.out.println(car3.make);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.isDiesel);
        System.out.println(car3.km);
    }
}

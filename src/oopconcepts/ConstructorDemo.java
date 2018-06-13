package oopconcepts;

public class ConstructorDemo {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println("Gear is: " + c1.gear + " and Speed is: " + c1.speed);

        System.out.println("************");

        Car c2 = new Car(10,1);
        System.out.println("Gear is: " + c2.gear + " and Speed is: " + c2.speed);
    }

}

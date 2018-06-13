package oopconcepts;

public class ClassDemo {
    public static void main(String[] args) {
        Car bmw = new Car(); // Create and initialise the object
        bmw.setMake("BMW");
        System.out.println("Make of the BMW is: " + bmw.getMake());

        Car benz = new Car();
        benz.setMake("Benz");
        System.out.println("Make of the Benz is: " + benz.getMake());

        benz.setModel("C300");
        System.out.println("Model of Benx is: " + benz.getModel());

        benz.setYear(1800);
        System.out.println("Year of Benz is: " + benz.getYear());
    }
}


package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Default array length is 10
        ArrayList<String> cars = new ArrayList<>();
        // Adding
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Audi");

        // Size
        int size = cars.size();
        System.out.println("The size of the list is: " + size);

        // Get
        System.out.println("The item on index 1 is: " + cars.get(1));

        //
        System.out.println("Iteration example");
        for (int i = 0; i < size; i++) {
            System.out.println("Item on index " + i + " is: " + cars.get(i));
        }

        System.out.println("\nNext for loop example");
        for (String car : cars) {
            System.out.println("The item is: " + car);
        }

        // Remove
        cars.remove(0);
        cars.remove(1);
        System.out.println("\nNext for loop example after removing");
        for (String car : cars) {
            System.out.println("The item is: " + car);


        }

    }
}




package automobile;
// Difference in data type of arguments

public class CarsOverloading2 {

    public static void main(String[] args){
        increaseSeatHeight(2);
        increaseSeatHeight("3");

    }

    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the Integer one.");
    }

    public static void increaseSeatHeight(String heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the String one.");
    }
}

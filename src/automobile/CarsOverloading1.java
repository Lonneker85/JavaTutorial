package automobile;
// Different number of parameters in argument list

public class CarsOverloading1 {

    // CarOverloading1 - Number of parameters could be different
    // CarOverloading2 - Data type of parameters are different
    // CarOverloading3 - Sequence of data type is different
    // CarOverloadingQuestions - Can't overload just on return type
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(3, true);
    }

    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
        if (rememberHeight) {
            System.out.println("Your selection is saved");
        } else {
            System.out.println("Your selection is not saved");
        }
    }
}

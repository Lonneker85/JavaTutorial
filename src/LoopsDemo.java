public class LoopsDemo {
    public static void main(String[] args) {

        //for (int i = 0; i < 10; i++){
        //  System.out.println("The value of i: " +1);


        int[] numbers = {10, 20, 30};
        //for (int i = 0; i < numbers.length; i++) {
          //  System.out.println("The value of index is: " + i + " is : " + numbers[i]);
        //}

        for (int number : numbers){
            System.out.println("The value is: " + number);
        }

        String[] garage = {"bmw", "benz", "audi"};
        for (String car : garage){
            System.out.println("Today I will take the: " + car);
        }
    }
}


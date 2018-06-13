package staticpackage;

public class StaticKeynotesDemo {

    // Static method can't use the non-static variable or method directly
    // This and super can't be used in static context

    public int addNum = 10;
    public static int addNumStatic = 10;

    public static void main(String[] args) {
        StaticKeynotesDemo s1 = new StaticKeynotesDemo();
        int output = s1.sum(20);
        int staticOutput = sumStatic(10);
        System.out.println("The output is: " + output);
        System.out.println("The output is: " + staticOutput);
    }

    public int sum(int num){
        return num + addNum;
    }

    public static int sumStatic(int num){
        return num + addNumStatic;
    }
}

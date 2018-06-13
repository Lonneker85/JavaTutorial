package staticpackage;


public class StaticDemo {
    public static void main(String[] args) {
        StaticExampleClass s1= new StaticExampleClass("BMW");
        System.out.println("Make of Car is: " + s1.getMake());
        System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());

        StaticExampleClass s2= new StaticExampleClass("Mercedes");
        System.out.println("Make of Car is: " + s2.getMake());
        System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());

        StaticExampleClass s3= new StaticExampleClass("Toyoya");
        System.out.println("Make of Car is: " + s3.getMake());
        System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());

        StaticExampleClass s4= new StaticExampleClass("Audi");
        System.out.println("Make of Car is: " + s4.getMake());
        System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());

        StaticExampleClass s5= new StaticExampleClass("Alfa Romeo");
        System.out.println("Make of Car is: " + s5.getMake());
        System.out.println("This is instance number: " + StaticExampleClass.getInstanceNum());
    }
}

package automobile;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Cars c1 = new Cars(1);
        c1.increaseSpeed();
        c1.speed = 10; // Cars Class
        c1.publicSpeed = 100;
        c1.protectedSpeed = 101;


    }
}

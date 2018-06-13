package automobile;

public class Cars {
    // No modifier - accessible in the same package
    int speed;

    // Private - only available in class
    private int privateSpeed;

    // Public - available almost everywhere
    public int publicSpeed;

    // Protected - only available in same package or in a subclass / used with automobile -> extends etc.
    protected int protectedSpeed;

    public Cars(int startSpeed) {
        speed = startSpeed;
    }


    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing speed of Cars");
    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing speed of Cars");

    }

}


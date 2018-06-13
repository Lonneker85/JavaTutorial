package automobile;

public class BMW extends Cars {
    public BMW (int startSpeed){
        super(startSpeed);
    }

    @Override
    public void increaseSpeed(){
        System.out.println("Increasing speed of BMW");
    }

    public void headsupDisplayNavigation(){
        System.out.println("BMW Specific Functionality");
    }

}

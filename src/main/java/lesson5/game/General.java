package lesson5.game;

public class General extends Soldier {

    private String slogan = "Never surrender";

    public General(String rank) {
        super(rank);
        super.health = super.health*100;
        System.out.println("General health increased *100");
    }

    public String getSlogan(){
        return slogan;
    }

    @Override
    public String toString(){
        return "General health " + super.health + " his slogan: " + slogan;
    }
}

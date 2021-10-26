package lesson5;

public class Room2 extends Room{
    public Room2(double width, double length, double height) {
        super(width, length, height);
    }

    public double calculateCapacity(){
        return super.calculateCapacity()*1000;
    }

    public double calculateSquare(){
        return super.getWidth() * super.getLength();
    }

    @Override
    public String toString(){
        return "Rum sum= " + calculateCapacity() + "\n" + "Ploshad room = " + calculateSquare();
    }


}

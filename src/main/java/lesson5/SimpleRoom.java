package lesson5;

public class SimpleRoom {

    protected double width = 0.0;
    protected double length = 0.0;

    public SimpleRoom(double width, double length){
        this.width = width;
        this.length = length;
        System.out.println("SimpleRoom created");
    }

    public void info(){
        System.out.println("Team: widht = " + width+"" +"lengh: " + length);
        System.out.println("Sum room: " + width*length);

    }

    public static void main(String[] args) {
        SimpleRoom simpleRoom = new SimpleRoom(5,5);
        simpleRoom.info();
    }

}

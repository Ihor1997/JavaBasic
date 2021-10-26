package lesson5;

public class Room {
    protected double width = 0.0;
    protected double length = 0.0;
    protected double height = 0.0;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double calculateCapacity(){
        return width * length*height;
    }

    public static void main(String[] args) {
        Room room = new Room(6,6,6);
        System.out.println("room capacity=" + room.calculateCapacity()+" m.2");
    }

}

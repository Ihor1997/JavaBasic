package lesson5;

public class SimpleRoom2 extends SimpleRoom{
    protected double height;
    public SimpleRoom2(double width, double length, double h) {
        super(width, length);
        height = h;
        System.out.println("SimpleRoom 2 created");
    }

    public void info2(){
        System.out.println("Team: widht = " + width+"" +"lengh: " + length+ ", height= " +height);
        System.out.println("Sum room: " + width*length*height);


    }

    public static void main(String[] args) {
        SimpleRoom2 simpleRoom2 = new SimpleRoom2(5,5,2);
        System.out.println("SimpleRoom method");
        simpleRoom2.info();
        System.out.println("SimpleRoom2 method");
        simpleRoom2.info2();
    }

}

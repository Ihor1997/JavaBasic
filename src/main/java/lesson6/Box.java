package lesson6;

public class Box {
    private double width = 0.0;
    private double depth = 0.0;
    private double height = 0.0;

    Box(){
        width = 10;
        depth = 10;
        height = 10;
    }

    Box(Box box){
        width = box.width;
        depth = box.depth;
        height = box.height;
    }

    void setParams(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    int getVolume(){
        return (int) (width*height*depth);
    }


    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(box);
        System.out.println("Volume is: " + box1.getVolume());
    }
}

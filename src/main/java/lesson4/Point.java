package lesson4;

public class Point {

    private int x,y;
    private boolean visibility;

    void createPoint(int a, int b){
        x = a;
        y = b;
        visibility = true;
    }

    void setVisibility(boolean visibility){
        this.visibility = visibility;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
         this.x = x;
    }
}

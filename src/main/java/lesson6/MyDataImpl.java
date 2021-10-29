package lesson6;

public class MyDataImpl implements MyData {

    public boolean isNull(String str){
        System.out.println("Check null");
        return  str == null ? true:false;
    }

    public static void main(String[] args) {
        MyData myData = new MyDataImpl();
        myData.print("");
        MyData.isNull("");
    }
}

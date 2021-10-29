package lesson6;

public interface MyData {
    default void print(String str){
        if (!isNull(str)){
            System.out.println("Class " + MyData.class.getName() + " Write line: " + str);
        }
    }

    static boolean isNull(String str){
        System.out.println("Static method checking for null");
        return str == null ? true: "".equals(str) ? true:false;
    }
}

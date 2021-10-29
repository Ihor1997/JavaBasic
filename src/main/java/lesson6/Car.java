package lesson6;

public interface Car {
    public default void gas(){
       System.out.println("Gaz");
   };
    public default void brake(){
       System.out.println("Brake");
   };
}

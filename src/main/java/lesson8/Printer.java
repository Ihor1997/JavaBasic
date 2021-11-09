package lesson8;

public class Printer<T,S> {

    private T sum;
    private S num;

    public Printer(T sum, S num) {
        this.sum = sum;
        this.num = num;
    }

    public <T> void print(T[] items){
        for (T item: items){
            System.out.println(item);
        }
    }
}

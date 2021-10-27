package lesson6;

public class Cat {

    int age;
    int birthday;

    Cat(int i, int j){
        age = i;
        birthday = j;
    }

    Cat(int i){
        this(i,i);
    }


    Cat(){
        this(0);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
    }
}

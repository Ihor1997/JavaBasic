package lesson7.Objects;

import java.io.*;

public class BasketCats {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat vaska = new Cat("Vaska", "Gray", 4);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);

        outputStream.writeObject(vaska);
        outputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        Cat cloneCat = (Cat) objectInputStream.readObject();
        System.out.println(vaska);
        System.out.println(cloneCat);
        System.out.println("**************");
        System.out.println("Black");

        System.out.println(vaska);
        System.out.println(cloneCat);
    }
}

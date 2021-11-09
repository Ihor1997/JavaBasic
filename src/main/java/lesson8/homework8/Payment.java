package lesson8.homework8;

import java.util.ArrayList;
import java.util.Date;

public class Payment {


   static class Purchase<T>{

       ArrayList<T> arrayList;
       public Purchase(ArrayList<T> purchases) {
           this.arrayList = addPurchases(purchases);
           for (T s: purchases) {
               System.out.println("Purchases: " + s);
           }
       }


       private ArrayList<T> addPurchases(ArrayList<T> arrayList){
           ArrayList<ArrayList<T>> temp = new ArrayList<>();
           for (int i = 0; i < arrayList.size(); i++) {
               temp.add(arrayList);
           }
           return (ArrayList<T>) temp;
       }
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new  ArrayList<>();
        strings.add("First Purchase");
        strings.add("Second Purchase");

        new Payment.Purchase<>(strings);
    }
}

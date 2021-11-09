package lesson8.homework8;

import java.util.ArrayList;
import java.util.Date;

public class Notepad {


     static class DateOfRecordFormatter<T> {

        Date date;

        ArrayList<T> arrayList;

        public DateOfRecordFormatter(ArrayList<T> records) {
            date = new Date();
            this.arrayList = addRecords(records);
            for (T s: records) {
                System.out.println("Records: " + s + ", " + "Date: " + date);
            }
        }


        private ArrayList<T> addRecords(ArrayList<T> arrayList){
            ArrayList<ArrayList<T>> temp = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                temp.add(arrayList);
            }
            return (ArrayList<T>) temp;
        }

     }

    public static void main(String[] args) {
         ArrayList<String> strings = new  ArrayList<>();
         strings.add("FIrst");
         strings.add("Second");

        new DateOfRecordFormatter<>(strings);
    }

}

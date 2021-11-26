package lesson12.homework12.storeSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//14
public class StockSort {

    public static void main(String[] args) {
        Stock stock = new Stock("Asus", 1111, 1);
        Stock stock1 = new Stock("Dell", 2222, 2);
        Stock stock2 = new Stock("Bell", 3333, 3);

        List<Stock> stocks = new ArrayList<>();
        stocks.add(stock);
        stocks.add(stock1);
        stocks.add(stock2);
        System.out.println(stocks);

    }

    public List<Stock> sortList(List<Stock> listToSort, String sortBy){
        switch (sortBy){
            case "name":
               // listToSort.sort(listToSort);


            case "price":


            case "rating":

        }
       // listToSort.sort();
        return listToSort;
    }

}

package lesson12.homework12.generalTasks;

public class Product {

   private String shopName;

    public Product(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "shopName='" + shopName + '\'' +
                '}';
    }
}

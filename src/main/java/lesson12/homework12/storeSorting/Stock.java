package lesson12.homework12.storeSorting;

public class Stock {

    private String productName;
    private long price;
    private int rating;

    public Stock(String productName, long price, int rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

}

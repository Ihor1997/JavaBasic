package lesson7;

public class Car {

    private static  int count;
    private int id;
    private String _maker;
    private double _price;
    private String _year;
    private String _color;


    public Car() {
        count++;
        this.id = count;
    }

    public Car(String _maker, double _price, String _year, String _color) {
        this._maker = _maker;
        this._price = _price;
        this._year = _year;
        this._color = _color;
        count++;
        id = count;
    }

    public String toString(){
        return "Car " + id + " " + _maker + " " + _color + " " + _price + " " + _year + " ";
    }

    public int getId (){
        return this.id;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get_maker() {
        return _maker;
    }

    public void set_maker(String _maker) {
        this._maker = _maker;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public String get_year() {
        return _year;
    }

    public void set_year(String _year) {
        this._year = _year;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }
}

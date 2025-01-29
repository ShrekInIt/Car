package сar.auto;

public abstract class Car {
    private String model;
    private int year;
    private int price;

    //init
    {
        model = "Не указано";
    }
    //init

    //constructor
    public Car() {
    }

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //constructor

    //setters and getters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //setters and getters

    //metods
    public abstract String toString();
    //metods
}

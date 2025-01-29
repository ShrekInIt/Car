package сar.auto;

public class Audi extends Car implements CarInfo {
    public static final String country = "German";

    //constructor
    public Audi() {
    }

    public Audi(String model, int year, int price) {
        super(model, year, price);
    }
    //constructor

    //Setters and Getters

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
    //Setters and Getters

    //metods


    @Override
    public String toString() {
        return "Audi{модель: " + getModel() + ", Год производства: " + getYear() +  ", Цена вопроса: " + getPrice()+ ", Страна производства: " + country +"}";
    }
}


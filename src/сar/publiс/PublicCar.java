package сar.publiс;

public abstract class PublicCar {
    private String name;
    private int price;
    private int countPlace;

    //init
    {
        name = "Не указано";
    }
    //init

    //constructor
    public PublicCar() {
    }

    public PublicCar(String name, int price, int countPlace) {
        this.name = name;
        this.price = price;
        this.countPlace = countPlace;
    }
    //constructor

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountPlace() {
        return countPlace;
    }

    public void setCountPlace(int countPlace) {
        this.countPlace = countPlace;
    }
    //Setters and Getters

    //metods
    public abstract String toString();
    //metods
}

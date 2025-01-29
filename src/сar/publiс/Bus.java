package сar.publiс;

public class Bus extends PublicCar implements ToPay {
    private boolean pay;

    //init
    {
        pay = true;
    }
    //init

    //constructor
    public Bus() {
    }

    public Bus(String name, int price, int countPlace) {
        super(name, price, countPlace);
    }
    //constructor

    //Setters and Getters
    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
    //Setters and Getters

    //metods
    public void toPay(){
        if(isPay()){
            System.out.println("Молодец, оплатил");
        }else {
            System.out.println("Быстро оплатил");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", Название: "+getName()+", Цена проезда: "+getPrice()+ ", Количество мест:"+getCountPlace();
    }
    //metods
}

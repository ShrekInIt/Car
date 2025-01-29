package сar.millitary;

public class Car extends Technical{
    //constructor
    public Car() {
    }

    public Car(String name, boolean gun, int defence) {
        super(name, gun, defence);
    }
    //constructor

    //metods
    @Override
    public void shot() {
        if(isGun()){
            System.out.println("Бууууууm");
        }else {
            System.out.println("Где твоё оружие щегол");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"-модель - "+getName()+ ", Есть ли оружие: " + ((isGun())? "Да":"Нет") + ", Броня: " + getDefence() + "мм";
    }
    //metods
}

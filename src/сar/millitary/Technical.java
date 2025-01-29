package сar.millitary;

public abstract class Technical {
    private String name;
    private boolean gun;
    private int defence;

    //init
    {
        name = "Не указано";
        gun = true;
    }
    //init

    //constructor
    public Technical() {
    }

    public Technical(String name, boolean gun, int defence) {
        this.name = name;
        this.gun = gun;
        this.defence = defence;
    }
    //constructor

    //Setters and Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isGun() {
        return gun;
    }
    public void setGun(boolean gun) {
        this.gun = gun;
    }

    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }
    //Setters and Getters

    //metods
    public abstract void shot();

    public abstract String toString();
}

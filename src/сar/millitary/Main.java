package сar.millitary;

public class Main {
    public static void main(String[] args) {
        Tank t60 = new Tank("T60", true, 500);
        System.out.println(t60);
        t60.shot();
        System.out.println("\n");
        Car yral = new Car("Yral", false, 30);
        System.out.println(yral);
        yral.shot();
    }
}

package сar.publiс;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Карета", 50, 30);
        System.out.println(bus);
        bus.toPay();
        System.out.println("\n");
        Minibus minibus= new Minibus("78", 33, 20);
        minibus.setPay(false);
        System.out.println(minibus);
        minibus.toPay();
    }
}

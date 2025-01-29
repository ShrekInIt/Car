package сar.auto;

public class Main {
    public static void main(String[] args) {
        Audi audiA6 = new Audi("A6", 2006, 3_000_000);
        System.out.println(audiA6);
        System.out.println("\n");
        Lada lada2114 = new Lada("2114", 2006, 140000);
        System.out.println(lada2114);
    }
}

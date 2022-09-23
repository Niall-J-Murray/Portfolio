public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Wagu Beef", "Sourdough", 9.95);
        super.addExtra1("Fries", 2.85);
        super.addExtra2("Beer", 5.85);
    }

    @Override
    public void addExtra1(String type, double price) {
        System.out.println("Cannot add " + type + ". No additions allowed on Deluxe Burger.");
    }

    @Override
    public void addExtra2(String type, double price) {
        System.out.println("Cannot add " + type + ". No additions allowed on Deluxe Burger.");
    }

    @Override
    public void addExtra3(String type, double price) {
        System.out.println("Cannot add " + type + ". No additions allowed on Deluxe Burger.");
    }

    @Override
    public void addExtra4(String type, double price) {
        System.out.println("Cannot add " + type + ". No additions allowed on Deluxe Burger.");
    }
}

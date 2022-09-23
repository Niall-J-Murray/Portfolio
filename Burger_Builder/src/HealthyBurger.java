public class HealthyBurger extends Hamburger {
    private String healthyExtra1Type;
    private double healthyExtra1Price;

    private String healthyExtra2Type;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Seeded Wholegrain", price);
    }

    public void addHealthyExtra1(String type, double price) {
        this.healthyExtra1Type = type;
        this.healthyExtra1Price = price;
    }

    public void addHealthyExtra2(String type, double price) {
        this.healthyExtra2Type = type;
        this.healthyExtra2Price = price;
    }

    @Override
    public double totalBurgerPrice() {
        double hamburgerPrice = super.totalBurgerPrice();
        if (this.healthyExtra1Type != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println(healthyExtra1Type + " added for €" + healthyExtra1Price);
        }
        if (this.healthyExtra2Type != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println(healthyExtra2Type + " added for €" + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}

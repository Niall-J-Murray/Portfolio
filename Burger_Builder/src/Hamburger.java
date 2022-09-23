public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    private double price;

    private String extra1Type;
    private double extra1Price;

    private String extra2Type;
    private double extra2Price;

    private String extra3Type;
    private double extra3Price;

    private String extra4Type;
    private double extra4Price;

    public Hamburger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public void addExtra1(String type, double price) {
        extra1Type = type;
        extra1Price = price;
    }

    public void addExtra2(String type, double price) {
        extra2Type = type;
        extra2Price = price;
    }

    public void addExtra3(String type, double price) {
        extra3Type = type;
        extra3Price = price;
    }

    public void addExtra4(String type, double price) {
        extra4Type = type;
        extra4Price = price;
    }

    public double totalBurgerPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " " + this.meat + " burger on a " + this.bread + " bun costs: €" + this.price);

        if (extra1Type != null) {
            hamburgerPrice += extra1Price;
            System.out.println(extra1Type + " added for €" + extra1Price);
        }

        if (extra2Type != null) {
            hamburgerPrice += extra2Price;
            System.out.println(extra2Type + " added for €" + extra2Price);
        }

        if (extra3Type != null) {
            hamburgerPrice += extra3Price;
            System.out.println(extra3Type + " added for €" + extra3Price);
        }

        if (extra4Type != null) {
            hamburgerPrice += extra4Price;
            System.out.println(extra4Type + " added for €" + extra4Price);
        }

        return hamburgerPrice;
    }
}

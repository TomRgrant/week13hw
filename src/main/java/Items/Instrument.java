package Items;

public abstract class Instrument {
    private String material;
    private String colour;
    private double price;
    private double purchasedPrice;

    public Instrument(String material, String colour, double price, double purchasedPrice) {
        this.material = material;
        this.colour = colour;
        this.price = price;
        this.purchasedPrice = purchasedPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }
}

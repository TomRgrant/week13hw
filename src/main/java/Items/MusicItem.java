package Items;

public abstract class MusicItem {
    private String name;
    private double price;
    private double purchasedPrice;

    public MusicItem(String name, double price, double purchasedPrice) {
        this.name = name;
        this.price = price;
        this.purchasedPrice = purchasedPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }
}

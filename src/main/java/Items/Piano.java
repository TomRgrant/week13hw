package Items;

public class Piano extends Instrument implements ISell{
    private String type;
    private boolean pedals;

    public Piano(String material, String colour, double price, double purchasedPrice, String type, boolean pedals) {
        super(material, colour, price, purchasedPrice);
        this.type = type;
        this.pedals = pedals;
    }

    public String getType() {
        return type;
    }

    public boolean isPedals() {
        return pedals;
    }


    @Override
    public String sell() {
        return "Sold Piano";
    }
}

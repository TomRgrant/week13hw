package Items;

public class Guitar extends Instrument implements ISell{
    private int stringAmount;
    private String type;

    public Guitar(String material, String colour, double price, double purchasedPrice, int stringAmount, String type) {

        super(material, colour, price, purchasedPrice);
        this.stringAmount = stringAmount;
        this.type = type;
    }

    public int getStringAmount() {
        return stringAmount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String sell() {
        return "Sold Guitar";
    }
}

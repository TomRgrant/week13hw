package Items;

public class Drumstick extends MusicItem{
    private String woodType;

    public Drumstick(String name, double price, double purchasedPrice, String woodType) {
        super(name, price, purchasedPrice);
        this.woodType = woodType;
    }

    public String getWoodType() {
        return woodType;
    }
}

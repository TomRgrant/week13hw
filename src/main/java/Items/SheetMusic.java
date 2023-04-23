package Items;

public class SheetMusic extends MusicItem{
    private String name;
    private String composer;

    public SheetMusic(String name, double price, double purchasedPrice, String name1, String composer) {
        super(name, price, purchasedPrice);
        this.name = name1;
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}

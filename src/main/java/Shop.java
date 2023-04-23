import Items.Guitar;
import Items.ISell;

import java.util.ArrayList;

public class Shop implements ISell {
    private String name;
    private double till;
    private ArrayList stock;

    public Shop(String name, double till, ArrayList stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    @Override
    public String sell() {
        return null;
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }
}

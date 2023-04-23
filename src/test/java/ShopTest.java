import Items.Guitar;
import Items.ISell;
import Items.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar guitar;
    Piano piano;
    Piano piano2;
    ArrayList<ISell> stock;
    Shop shop;
    @Before
    public void setup() {
        guitar = new Guitar("Wood", "Brown", 15.00, 6.00, 6, "Acustic");
        piano = new Piano("Wood", "Black", 50.00, 25.00, "Keyboard", true);
        piano2 = new Piano("Wood", "White", 60.00, 30.00, "Keyboard", true);
        stock = new ArrayList<ISell>(Arrays.asList(guitar, piano, piano2));
        shop = new Shop("Mr Sounders", 100.00, stock);
    }

    @Test
    public void hasName() {
        assertEquals("Mr Sounders", shop.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(100.00, shop.getTill(), 0.01);
    }

    @Test
    public void hasStock() {
        assertEquals(3, shop.getStock());
    }

    @Test
    public void canAddItemToStock() {
        Guitar guitar2 = new Guitar("Wood", "Blue", 20.50, 10.00, 6, "Acustic");
        shop.addToStock(guitar2);
        assertEquals(4, shop.getStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStock());
    }

}

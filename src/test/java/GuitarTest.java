import Items.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    @Before
    public void setup() {
        guitar = new Guitar("Wood", "Brown", 15.00, 6.00, 6, "Acustic");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }
}

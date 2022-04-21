import static org.junit.Assert.*;

import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private final String EXPECTED_NAME = "EXPECTED";
    private final float EXPECTED_PRICE = 1.1f;
    private final Bun bun = new Bun(EXPECTED_NAME, EXPECTED_PRICE);

    @Test
    public void getName() {
        String actual = bun.getName();
        assertEquals("Наименование не совпадает", EXPECTED_NAME, actual);
    }

    @Test
    public void getPrice() {
        float actual = bun.getPrice();
        assertEquals("Цена не совпадает", EXPECTED_PRICE, actual, 0);
    }
}
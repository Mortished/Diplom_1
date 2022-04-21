import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {
    IngredientType firstType = SAUCE;
    IngredientType secondType = FILLING;

    @Test
    public void values() {
        IngredientType[] allType = IngredientType.values();
        assertEquals(firstType, allType[0]);
        assertEquals(secondType, allType[1]);

    }

    @Test
    public void valueOf() {
        IngredientType firstActual = IngredientType.valueOf(firstType.toString());
        IngredientType secondActual = IngredientType.valueOf(secondType.toString());
        assertEquals(firstType, firstActual);
        assertEquals(secondType, secondActual);
    }
}
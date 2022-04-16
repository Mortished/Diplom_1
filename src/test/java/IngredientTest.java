import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final IngredientType expectedType;
    private final String expectedName;
    private final float expectedPrice;

    public IngredientTest(IngredientType type, String name, float price) {
        expectedType = type;
        expectedName = name;
        expectedPrice = price;
    }

    @Parameterized.Parameters
    public static Object[][] createDifferentLion() {
        return new Object[][] {
            { SAUCE, "FirstName", 1.1f },
            { FILLING, "SecondName", 2.2f },
        };
    }

    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(expectedType, expectedName, expectedPrice);
        float actual = ingredient.getPrice();
        assertEquals("Цена не совпадает", expectedPrice, actual, 0);
    }

    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(expectedType, expectedName, expectedPrice);
        String actual = ingredient.getName();
        assertEquals("Наименование не совпадает", expectedName, actual);

    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(expectedType, expectedName, expectedPrice);
        IngredientType actual = ingredient.getType();
        assertEquals("Тип не совпадает", expectedType, actual);
    }
}
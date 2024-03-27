package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {
    @Test
    public void testGetFood() {
        Burger burger = new Burger();
        assertEquals("Burger", burger.getFood());
    }

    @Test
    public void testCost() {
        Burger burger = new Burger();
        assertEquals(10.25, burger.cost());
    }
}
package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest {
    @Test
    public void testGetFood() {
        HotDog hotDog = new HotDog();
        assertEquals("Hot Dog", hotDog.getFood());
    }

    @Test
    public void testCost() {
        HotDog hotDog = new HotDog();
        assertEquals(6.00, hotDog.cost());
    }
}
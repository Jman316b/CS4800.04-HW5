package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodWithKetchupTest {

    @Test
    public void testGetFood() {
        HotDog hotDog = new HotDog();
        FoodWithKetchup hotDogWithKetchup= new FoodWithKetchup(hotDog);
        assertEquals("Hot Dog w/ Ketchup", hotDogWithKetchup.getFood());
    }

    @Test
    public void testCost() {
        HotDog hotDog = new HotDog();
        FoodWithKetchup hotDogWithKetchup= new FoodWithKetchup(hotDog);
        assertEquals(6.25, hotDogWithKetchup.cost());
    }
}
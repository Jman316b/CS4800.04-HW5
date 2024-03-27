package Food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithMustardTest {

    @Test
    public void testGetFood() {
        HotDog hotDog = new HotDog();
        FoodWithMustard hotDogWithMustard= new FoodWithMustard(hotDog);
        assertEquals("Hot Dog w/ Mustard", hotDogWithMustard.getFood());
    }

    @Test
    public void testCost() {
        HotDog hotDog = new HotDog();
        FoodWithMustard hotDogWithMustard= new FoodWithMustard(hotDog);
        assertEquals(6.25, hotDogWithMustard.cost());
    }
}
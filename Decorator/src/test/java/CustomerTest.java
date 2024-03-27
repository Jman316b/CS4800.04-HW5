import Food.Burger;
import Food.FoodWithKetchup;
import Food.FoodWithMustard;
import Food.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void testApplyDiscount() {
        double expected = 9.45;

        Customer test = new Customer("James", true);
        Order testOrder = new Order(test);
        testOrder.addOrderItem(new FoodWithKetchup(new Burger()));

        double actual = test.applyDiscount(testOrder.orderTotal());
        assertEquals(expected, actual);
    }
}
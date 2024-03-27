import Food.Burger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OrderTest {

    @Test
    public void testOrderTotal() {
        double expected = 9.25; // Cost of a burger with the loyalty member discount

        Customer testCustomer = new Customer("Jessie", true);
        Order testOrder = new Order(testCustomer);

        Burger burger = new Burger();
        testOrder.addOrderItem(burger);

        double  actual = testOrder.orderTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderItems() {
        String expected = "Burger, "; // Cost of a burger with the loyalty member discount

        Customer testCustomer = new Customer("Jessie", true);
        Order testOrder = new Order(testCustomer);
        Burger burger = new Burger();
        testOrder.addOrderItem(burger);

        String actual = testOrder.orderItems();
        assertEquals(expected, actual);
    }
}
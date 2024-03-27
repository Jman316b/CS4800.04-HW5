import Food.Burger;
import Food.FoodWithKetchup;
import Food.FoodWithMustard;
import Food.HotDog;

public class Driver {
    public static void main(String[] args) {
        System.out.println("### Jessie's Order ###");
        Customer jessie = new Customer("Jessie", false);
        Order jessieOrder = new Order(jessie);
        jessieOrder.addOrderItem(new FoodWithKetchup(new FoodWithMustard(new HotDog())));
        jessieOrder.addOrderItem(new FoodWithKetchup(new Burger()));
        System.out.println(jessieOrder.orderItems());
        System.out.println("$" + jessie.applyDiscount(jessieOrder.orderTotal()));

        System.out.println("### Mike's Order ###");
        Customer mike = new Customer("Mike", true);
        Order mikeOrder = new Order(mike);
        mikeOrder.addOrderItem(new FoodWithKetchup(new Burger()));
        mikeOrder.addOrderItem(new HotDog());
        System.out.println(mikeOrder.orderItems());
        System.out.println("$" + mike.applyDiscount(mikeOrder.orderTotal()));

    }
}

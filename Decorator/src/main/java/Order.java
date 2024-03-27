import Food.Food;

import java.util.ArrayList;

public class Order {
    private ArrayList<Food> orderItems;
    private Customer customer;

    public ArrayList<Food> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Food> orderItems) {
        this.orderItems = orderItems;
    }

    public void addOrderItem(Food orderItem) {
        this.orderItems.add(orderItem);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order(Customer customer) {
        this.orderItems = new ArrayList<>();
        this.customer = customer;
    }

    public Order(ArrayList<Food> orderItems, Customer customer) {
        this.orderItems = orderItems;
        this.customer = customer;
    }

    public double orderTotal(){
        double total = 0;
        for (Food orderItem : orderItems) {
            total += orderItem.cost();
        }

        return total;
    }

    public String orderItems(){
        StringBuilder output = new StringBuilder();
        for (Food orderItem : orderItems){
            output.append(orderItem.getFood()).append(", ");
        }
        return output.toString();
    }
}

public class Customer {
    private String name;
    private boolean loyaltyMemberStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getLoyaltyMemberStatus() {
        return loyaltyMemberStatus;
    }

    public void setLoyaltyMemberStatus(boolean loyaltyMemberStatus) {
        this.loyaltyMemberStatus = loyaltyMemberStatus;
    }

    public Customer(String name) {
        this.name = name;
        this.loyaltyMemberStatus = false;
    }

    public Customer(String name, boolean loyaltyMemberStatus) {
        this.name = name;
        this.loyaltyMemberStatus = loyaltyMemberStatus;
    }

    public double applyDiscount(double orderTotal){
        if(loyaltyMemberStatus)
            return orderTotal -= (orderTotal * 0.10);
        return orderTotal;
    }
}

package Food;

public class FoodWithKetchup implements Food {
    private final Food decoratedFood;

    public String getFood() {
        return decoratedFood.getFood() + " w/ Ketchup";
    }

    public double cost() {
        return decoratedFood.cost() + 0.25;
    }

    public FoodWithKetchup(Food food){
        this.decoratedFood = food;
    }
}

package Food;

public class FoodWithMustard implements Food {
    private final Food decoratedFood;

    public String getFood() {
        return decoratedFood.getFood() + " w/ Mustard";
    }

    public double cost() {
        return decoratedFood.cost() + 0.25;
    }

    public FoodWithMustard(Food food){
        this.decoratedFood = food;
    }
}

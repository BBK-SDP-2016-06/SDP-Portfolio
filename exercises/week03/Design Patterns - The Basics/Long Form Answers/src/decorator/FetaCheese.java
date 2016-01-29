package decorator;

public class FetaCheese extends PizzaDecorator{

    private Pizza pizza;

    public FetaCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Feta Cheese (0.50)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.50;
    }
}

package decorator;

public class GreenOlives extends PizzaDecorator{

    private Pizza pizza;

    public GreenOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Green Olives (0.50)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.50;
    }
}

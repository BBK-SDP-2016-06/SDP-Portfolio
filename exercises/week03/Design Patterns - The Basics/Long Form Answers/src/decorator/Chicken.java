package decorator;

public class Chicken extends PizzaDecorator{

    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken (0.20)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.20;
    }
}

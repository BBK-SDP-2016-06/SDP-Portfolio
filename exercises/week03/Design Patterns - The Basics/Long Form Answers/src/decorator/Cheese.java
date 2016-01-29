package decorator;

public class Cheese extends PizzaDecorator{

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese (0.20)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.20;
    }
}

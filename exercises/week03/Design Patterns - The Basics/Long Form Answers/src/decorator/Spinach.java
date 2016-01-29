package decorator;

public class Spinach extends PizzaDecorator{

    private Pizza pizza;

    public Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Spinach (0.30)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.30;
    }
}

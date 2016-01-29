package decorator;

public class Meat extends PizzaDecorator{

    private Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Meat (1.00)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 1.00;
    }
}

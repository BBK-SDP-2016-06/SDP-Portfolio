package decorator;

public class RomaTomatoes extends PizzaDecorator{

    private Pizza pizza;

    public RomaTomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Roma Tomatoes (0.20)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.20;
    }
}

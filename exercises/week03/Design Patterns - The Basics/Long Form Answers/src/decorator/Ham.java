package decorator;

public class Ham extends PizzaDecorator{

    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham (0.25)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 0.25;
    }
}

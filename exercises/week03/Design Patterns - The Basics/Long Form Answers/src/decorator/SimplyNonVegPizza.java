package decorator;

public class SimplyNonVegPizza implements Pizza {

    String description = "Simply Non-Veg Pizza (12.50)";
    Double price = 12.50;

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

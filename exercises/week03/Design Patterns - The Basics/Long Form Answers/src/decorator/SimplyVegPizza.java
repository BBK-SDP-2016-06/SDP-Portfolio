package decorator;

public class SimplyVegPizza implements Pizza {

    String description = "Simply Veg Pizza (9.50)";
    Double price = 9.50;

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

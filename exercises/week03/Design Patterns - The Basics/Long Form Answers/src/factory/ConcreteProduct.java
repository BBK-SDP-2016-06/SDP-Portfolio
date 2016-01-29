package factory;

public class ConcreteProduct implements Product {

    private String name;

    public ConcreteProduct(String productName) {
        this.name = productName;
    }

    @Override
    public String getProductType() {
        return getClass().getName();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void supplyProduct() {
        System.out.println(name + " of type " + getProductType() + " is being supplied");
    }
}

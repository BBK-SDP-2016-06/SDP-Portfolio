package factory;

public interface Creator {
    static Product factoryMethod() {
        return factoryMethod("No name");
    }

    static Product factoryMethod(String productName) {
        return new ConcreteProduct(productName);
    }

}

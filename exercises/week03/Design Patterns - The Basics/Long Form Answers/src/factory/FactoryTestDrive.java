package factory;

public class FactoryTestDrive {
    public static void main(String[] args) {

        Product myProduct = ConcreteCreator.getProduct();
        Product myNamedProduct = Creator.factoryMethod("Column");

        myProduct.supplyProduct();
        myNamedProduct.supplyProduct();

    }
}

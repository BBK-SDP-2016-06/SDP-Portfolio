package factory;

public class ConcreteCreator implements Creator {

    public static Product getProduct() {
        return Creator.factoryMethod();
    }
}

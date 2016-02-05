package Question10_Bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        car = new Motoren(product2, "Motoren xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}

package Question10_Bridge;

public abstract class Car {

    private Product product;
    private String carName;

    public Car(Product product, String carName) {
        this.product = product;
        this.carName = carName;
    }

    public void produceProduct() {
        System.out.println("Producing " + product.getProductName());
        System.out.println("Modifying product " + product.getProductName() + " according to " + carName);
    }

    public void assemble() {
        System.out.println("Assembling " + product.getProductName() + " for " + carName);
    }

    public void printDetails() {
        System.out.println("Car: " + carName + ", Product: " + product.getProductName() + '\n');
    }
}

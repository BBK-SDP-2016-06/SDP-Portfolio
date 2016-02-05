package Question10_Bridge;

public abstract class Product {

    private String productName;

    public Product(String name) {
        productName = name;
    }

    public String getProductName() {
        return productName;
    }

}

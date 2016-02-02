package Question06_Builder;

public interface CarBuilder {

    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBrakes();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
    Car getCar();

}

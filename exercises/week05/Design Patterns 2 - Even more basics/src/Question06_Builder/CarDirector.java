package Question06_Builder;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build() {
        this.carBuilder.buildBodyStyle();
        this.carBuilder.buildPower();
        this.carBuilder.buildEngine();
        this.carBuilder.buildBrakes();
        this.carBuilder.buildSeats();
        this.carBuilder.buildWindows();
        this.carBuilder.buildFuelType();
    }

}

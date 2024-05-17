package decorateur;

public abstract class CarDecorator extends Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getWording() {
        return super.getWording();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

}

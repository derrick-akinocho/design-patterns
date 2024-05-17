package decorateur;

public class AutomaticParking extends CarDecorator{

    AutomaticParking(Car car) {
        super(car);
    }

    @Override
    public String getWording() {
        return car.getWording() + ", Stationnement automatique";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1500;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + 25;
    }
}

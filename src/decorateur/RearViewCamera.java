package decorateur;

public class RearViewCamera extends CarDecorator{

    RearViewCamera(Car car) {
        super(car);
    }
    @Override
    public String getWording() {
        return car.getWording() + ", Caméra de recul";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 500;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + 5;
    }

}

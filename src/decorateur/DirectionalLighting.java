package decorateur;

public class DirectionalLighting extends CarDecorator{

    DirectionalLighting(Car car) {
        super(car);
    }

    @Override
    public String getWording() {
        return car.getWording() + ", éclairage directionnel";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 3000;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + 24;
    }
}

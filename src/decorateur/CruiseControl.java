package decorateur;

public class CruiseControl extends CarDecorator{

    CruiseControl(Car car) {
        super(car);
    }

    @Override
    public String getWording() {
        return car.getWording() + ", Régulateur de vitesse";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1500;
    }

    @Override
    public int getWeight() {
        return car.getWeight() + 4;
    }
}

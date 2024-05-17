package abstract_factory;

public class Computer extends Device{

    private final String color;
    private final int storageCapacity;
    private final String brand;

    public Computer(String color, int storageCapacity, String brand) {
        this.color = color;
        this.storageCapacity = storageCapacity;
        this.brand = brand;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}

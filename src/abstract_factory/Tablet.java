package abstract_factory;

public class Tablet extends Device{

    private final String color;
    private final int storageCapacity;
    private final String brand;

    public Tablet(String color, int storageCapacity, String brand) {
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

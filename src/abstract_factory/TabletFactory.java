package abstract_factory;

public class TabletFactory implements DeviceAbstractFactory{

    private String color;
    private String brand;
    private int storagecApacity;

    public TabletFactory(String color, String brand, int storagecApacity) {
        this.color = color;
        this.brand = brand;
        this.storagecApacity = storagecApacity;
    }

    @Override
    public Device createDevice() {
        return new Tablet(color, storagecApacity, brand);
    }
}

package abstract_factory;

public class SmartPhoneFactory implements DeviceAbstractFactory{

    private final String color;
    private final String brand;
    private final int storagecApacity;

    public SmartPhoneFactory(String color, String brand, int storagecApacity) {
        this.color = color;
        this.brand = brand;
        this.storagecApacity = storagecApacity;
    }

    @Override
    public Device createDevice() {
        return new SmartPhone(color, storagecApacity, brand);
    }
}

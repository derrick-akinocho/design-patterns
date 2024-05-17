package abstract_factory;

public abstract class Device {

    public Device() {
    }

    public abstract String getColor();
    public abstract String getBrand();
    public abstract int getStorageCapacity();

    @Override
    public String toString() {
        return "Device{" +
                "color='" + getColor() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", storageCapacity=" + getStorageCapacity() +
                '}';
    }

}

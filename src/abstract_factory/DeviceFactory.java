package abstract_factory;

public class DeviceFactory {

    public DeviceFactory() {
    }

    public static Device getDevice (DeviceAbstractFactory factory){
        return factory.createDevice();
    }
}

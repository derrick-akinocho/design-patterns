package abstract_factory;

public class TestAbstractFactory {

    public static void main(String[] args) {

        // Ajout d'un Computer Factory
        DeviceAbstractFactory computerFactory = new ComputerFactory("White", "HP", 1000);
        // Ajout d'un Tablet Factory
        DeviceAbstractFactory tabletFactory = new TabletFactory("Black", "Samsung", 256);
        // Ajout d'un SmartPhone Factory
        DeviceAbstractFactory smartPhoneFactory = new SmartPhoneFactory("Grey", "Apple", 128);

        Device computer = DeviceFactory.getDevice(computerFactory);
        Device tablet = DeviceFactory.getDevice(tabletFactory);
        Device smartPhone = DeviceFactory.getDevice(smartPhoneFactory);

        System.out.println("Computer: " + computer);
        System.out.println("Tablet: " + tablet);
        System.out.println("SmartPhone: " + smartPhone);
    }

}

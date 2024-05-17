package decorateur;

public class TestDecorateur {

    public static void main(String[] args) {

        // Ajout d'une voiture CitroenC3
        Car myCar1 = new CitroenC3();
        myCar1 = new RearViewCamera(myCar1);
        myCar1 = new AutomaticParking(myCar1);
        myCar1 = new CruiseControl(myCar1);
        myCar1 = new DirectionalLighting(myCar1);

        // Ajout d'une voiture MercedesClassA
        Car myCar2 = new MercedesClassA();
        myCar2 = new CruiseControl(myCar2);
        myCar2 = new DirectionalLighting(myCar2);

        // Ajout d'une voiture CitroenC3
        Car myCar3 = new CitroenC3();
        myCar3 = new RearViewCamera(myCar3);
        myCar3 = new DirectionalLighting(myCar3);

        // Ajout d'une voiture MercedesClassA
        Car myCar4 = new MercedesClassA();
        myCar4 = new RearViewCamera(myCar4);
        myCar4 = new CruiseControl(myCar4);
        myCar4 = new DirectionalLighting(myCar4);

        // Ajout d'une voiture MercedesClassA
        Car myCar6 = new MercedesClassA();
        myCar6 = new RearViewCamera(myCar6);
        myCar6 = new AutomaticParking(myCar6);
        myCar6 = new CruiseControl(myCar6);
        myCar6 = new DirectionalLighting(myCar6);

        System.out.println("Car : [wording = " + myCar1.getWording() + ", price = " + myCar1.getPrice() + " euro, weight = " + myCar1.getWeight() + "]");
        System.out.println("Car : [wording = " + myCar2.getWording() + ", price = " + myCar2.getPrice() + " euro, weight = " + myCar2.getWeight() + "]");
        System.out.println("Car : [wording = " + myCar3.getWording() + ", price = " + myCar3.getPrice() + " euro, weight = " + myCar3.getWeight() + "]");
        System.out.println("Car : [wording = " + myCar4.getWording() + ", price = " + myCar4.getPrice() + " euro, weight = " + myCar4.getWeight() + "]");
        System.out.println("Car : [wording = " + myCar6.getWording() + ", price = " + myCar6.getPrice() + " euro, weight = " + myCar6.getWeight() + "]");

    }
}

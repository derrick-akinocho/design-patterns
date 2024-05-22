package composite;

public class Customer {

    public static void main(String[] args) {

        Tractor tractor = new Tractor(100);
        Trailer trailer = new Trailer(140);

        Truck truck = new Truck();
        truck.add(tractor);
        truck.add(trailer);

        System.out.println("Poids de la remorque : " + trailer.getWeight() + "\nPoids de la tracteur : " + tractor.getWeight());
        System.out.println("Poids du camion : " + truck.getWeight());

    }
}

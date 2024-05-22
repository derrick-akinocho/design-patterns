package composite;

public class Tractor implements Component {

    private int weight;

    public Tractor(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
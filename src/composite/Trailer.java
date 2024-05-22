package composite;

public class Trailer implements Component {

    private int weight;

    public Trailer(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
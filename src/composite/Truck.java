package composite;

import java.util.ArrayList;
import java.util.List;

public class Truck implements Component{

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public int getWeight() {
        int totalWeight = 0;
        for (Component component : components) {
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }

}

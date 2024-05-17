package prototype;

import java.util.HashMap;

public class ShapeCache {

    private static final HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapes.get(shapeId);
        return cachedShape.duplicate();
    }

    public static void loadCache() {
        Oval oval = new Oval();
        oval.setId("1");
        shapes.put(oval.getId(), oval);

        Lozenge lozenge = new Lozenge();
        lozenge.setId("2");
        shapes.put(lozenge.getId(), lozenge);

        Trapeze trapeze = new Trapeze();
        trapeze.setId("3");
        shapes.put(trapeze.getId(), trapeze);

        Square square = new Square();
        square.setId("4");
        shapes.put(square.getId(), square);
    }

}

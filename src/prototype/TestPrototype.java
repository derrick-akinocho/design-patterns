package prototype;

public class TestPrototype {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        // Ajout d'un Oval
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Je dessine un " + clonedShape1.getType() + " \u25EF dont l'id est 43");

        // Ajout d'un Lozenge
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Je dessine un " + clonedShape2.getType() + " \u25CA dont l'id est 44");

        // Ajout d'un Trapeze
        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Je dessine un " + clonedShape3.getType() + " \u25B1 dont l'id est 45");

        // Ajout d'un Carré
        Shape clonedShape4 = ShapeCache.getShape("4");
        System.out.println("Je dessine un " + clonedShape4.getType() + " \u25A1 dont l'id est 46");

        // Ajout d'un Carré
        Shape clonedShape5 = ShapeCache.getShape("4");
        System.out.println("Je dessine un " + clonedShape5.getType() + " \u25A1 dont l'id est 47");
    }
}

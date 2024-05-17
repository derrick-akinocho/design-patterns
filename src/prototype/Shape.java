package prototype;

public abstract class Shape implements Cloneable{

    private String id;
    public String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Shape duplicate () {

        Shape shape = null;
        try{
            shape = (Shape) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return shape;
    }
}

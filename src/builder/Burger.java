package builder;

public class Burger {

    String bread;
    String sauce;
    String content;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

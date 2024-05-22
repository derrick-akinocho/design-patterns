package builder;

public abstract class BurgerBuilder {

    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void createNewBurger() {
        burger = new Burger();
    }

    public abstract void buildBread();
    public abstract void buildSauce();
    public abstract void buildContent();
}

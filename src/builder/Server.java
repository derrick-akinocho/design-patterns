package builder;

public class Server  {

    public BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb) {
        burgerBuilder = bb;
    }

    public Burger getBurger() {
        return burgerBuilder.getBurger();
    }

    public void buildBurger() {
        burgerBuilder.createNewBurger();
        burgerBuilder.buildBread();
        burgerBuilder.buildSauce();
        burgerBuilder.buildContent();
    }
}

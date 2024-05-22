package builder;

public class BigMacBuilder extends BurgerBuilder {

    @Override
    public void buildBread() {
        burger.setBread("Petit pain au sésame");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Sauce Big Mac");
    }

    @Override
    public void buildContent() {
        burger.setContent("Galettes de bœuf + laitue + fromage + cornichons + oignons");
    }
}

package builder;

public class RoyalDeluxeBuilder extends BurgerBuilder {

    @Override
    public void buildBread() {
        burger.setBread("Petit pain de luxe");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Sauce moutarde");
    }

    @Override
    public void buildContent() {
        burger.setContent("Galette de bœuf + tomate + laitue + fromage + oignons");
    }
}
package builder;

public class SalmonBurgerBuilder extends BurgerBuilder {

    @Override
    public void buildBread() {
        burger.setBread("Petit pain de blé entier");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Sauce à l'aneth");
    }

    @Override
    public void buildContent() {
        burger.setContent("Galette de saumon + laitue + tomate + oignon rouge");
    }
}
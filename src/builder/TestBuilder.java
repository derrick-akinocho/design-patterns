package builder;

public class TestBuilder {

    public static void main(String[] args) {

        Server server = new Server();

        BurgerBuilder bigMacBuilder = new BigMacBuilder();
        BurgerBuilder royalDeluxeBuilder = new RoyalDeluxeBuilder();
        BurgerBuilder salmonBurgerBuilder = new SalmonBurgerBuilder();

        server.setBurgerBuilder(bigMacBuilder);
        server.buildBurger();
        Burger bigMac = server.getBurger();
        System.out.println("Big Mac: " + bigMac);

        server.setBurgerBuilder(royalDeluxeBuilder);
        server.buildBurger();
        Burger royalDeluxe = server.getBurger();
        System.out.println("Royal Deluxe: " + royalDeluxe);

        server.setBurgerBuilder(salmonBurgerBuilder);
        server.buildBurger();
        Burger salmonBurger = server.getBurger();
        System.out.println("Salmon Burger: " + salmonBurger);

    }
}

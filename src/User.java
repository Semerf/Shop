public class User {
    private final String login;
    private String password;
    private final Basket basket;

    public void addGoodToBasket(Good good) {
        basket.add(good);
    }

    @Override
    public String toString() {
        return "User login = " + login + '\n' +
                "Goods in a basket:\n" + basket;
    }

    private class Basket extends GoodList {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
}

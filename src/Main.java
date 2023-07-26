public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Category1");
        Category category2 = new Category("Category2");
        Category category3 = new Category("Category3");
        for (int i = 0; i < 10; i++) {
            category1.add(new Good("Good" + i, Math.round(Math.random() * 100), Math.round(Math.random() * 4) + 1));
            category2.add(new Good("Good" + (i + 10), Math.round(Math.random() * 100), Math.round(Math.random() * 4) + 1));
            category3.add(new Good("Good" + (i + 20), Math.round(Math.random() * 100), Math.round(Math.random() * 4) + 1));
        }
        System.out.println(category1.toString() + category2 + category3);

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        for (int i = 0; i < 3; i++) {
            user1.addToUserBasket(category1.getGoods()[(int) Math.round(Math.random() * 9)]);
            user1.addToUserBasket(category2.getGoods()[(int) Math.round(Math.random() * 9)]);
            user1.addToUserBasket(category3.getGoods()[(int) Math.round(Math.random() * 9)]);
            user2.addToUserBasket(category1.getGoods()[(int) Math.round(Math.random() * 9)]);
            user2.addToUserBasket(category2.getGoods()[(int) Math.round(Math.random() * 9)]);
            user2.addToUserBasket(category3.getGoods()[(int) Math.round(Math.random() * 9)]);
        }
        System.out.println(user1.toString() + user2);
    }
}
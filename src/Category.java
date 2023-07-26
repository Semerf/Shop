import java.util.Arrays;

public class Category extends GoodList {

    private String name;

    public Category(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category name = " + name + "\nGoods in category:\n" + super.toString();
    }
}

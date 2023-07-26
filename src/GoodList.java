import java.util.Arrays;

public class GoodList {
    private Good[] goods;
    private int count = 0;

    public GoodList() {
        this.goods = new Good[10];
        count = 0;
    }

    public void add(Good good) {
        if (count >= goods.length) {
            goods = new Good[goods.length * 2];
        }
        goods[count] = good;
        count++;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(goods[i]);
        }
        return result.toString() + '\n';
    }

    public Good[] getGoods() {
        return goods;
    }
}

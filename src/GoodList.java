import java.util.Arrays;

public class GoodList {
    private Good[] goods;
    private int count;

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
        return "Goods:\n" + Arrays.toString(goods);
    }

    public Good[] getGoods() {
        return goods;
    }
}

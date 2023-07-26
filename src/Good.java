public class Good {
    private String name;
    private double price;
    private double rate;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                "}\n";
    }

    public Good(String name, double price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }
}

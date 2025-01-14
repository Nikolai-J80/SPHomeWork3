public class Basket {
    private Product product;
    private int count;

    public Basket(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

    public String toString() {
        return product.getName() + " - " + count + " шт." + " - " + product.getPrice() * count + " руб.";
    }
}

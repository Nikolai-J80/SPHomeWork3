public class Shoes extends Product {
    private int size;
    private String soleMatirial;
    private String shoesMatrial;

    public Shoes(String name, int price, Gender gender, int size, String soleMatirial, String shoesMatrial) {
        super(name, price, gender);
        this.size = size;
        this.soleMatirial = soleMatirial;
        this.shoesMatrial = shoesMatrial;
    }

    @Override
    public String toString() {
        return getName() + " - " + getPrice() + " руб. " + "размер - " + size;
    }
}

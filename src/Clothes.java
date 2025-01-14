public class Clothes extends Product {
    private String size;
    private String matrial;
    private String color;

    public Clothes(String name, int price, Gender gender, String size, String matrial, String color) {
        super(name, price, gender);
        this.size = size;
        this.matrial = matrial;
        this.color = color;
    }

    @Override
    public String toString() {
        return getName() + ", цвет - " + color + ", цена - " + getPrice() + " руб. " + "размер - " + size;
    }

}

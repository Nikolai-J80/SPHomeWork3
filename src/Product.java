public abstract class Product {
    private String name;
    private int price;
    private Gender gender;

    public Product(String name, int price, Gender gender) {
        this.name = name;
        this.price = price;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + ", стоимостью: " + price + "руб.";
    }
}

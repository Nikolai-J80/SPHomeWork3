import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> catalog;
    private List<String> menu;

    public void fillCatalog() {
        catalog = Arrays.asList(
                new Shoes("Ботинки", 2000, Gender.UNISEX, 43, "Термоэластопласт", "Натуральная кожа"),
                new Shoes("Сапоги", 1000, Gender.MALE, 44, "Резина", "Резина"),
                new Shoes("Сандали", 500, Gender.MALE, 45, "Полиуретан", "Натуральная кожа"),
                new Shoes("Туфли", 1500, Gender.FEMALE, 38, "Полиуретан", "Натуральная кожа"),
                new Clothes("Футболка", 200, Gender.UNISEX, "Oversize", "Хлопок", "Белый"),
                new Clothes("Рубашка", 1700, Gender.MALE, "50", "Лен", "Бежевый"),
                new Clothes("Блузка", 2100, Gender.FEMALE, "42", "Шелк", "Красный")
        );
    }

    public void printCatalog() {
        for (Product item : catalog) {
            System.out.println(item);
        }
    }

    public Product catalogSearch(String name) {
        for (Product desiredProduct : catalog) {
            if (desiredProduct.getName().equalsIgnoreCase(name)) {
                return desiredProduct;
            }
        }
        return null;
    }

    public void fillInMenuItems() {
        menu = Arrays.asList(
                "Посмотреть каталог",
                "Добавить товар в корзину",
                "Посмотреть корзину",
                "Оформить заказ",
                "Выход"
        );
    }

    public void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + 1 + ". " + menu.get(i));
        }
    }


}

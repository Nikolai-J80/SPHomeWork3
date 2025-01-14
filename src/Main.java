import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MIN_ORDER_AMOUNT = 500;
    private static Store store = new Store();
    private static int totalSum;
    private static ArrayList<Basket> order = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        store.fillCatalog();
        store.fillInMenuItems();
        store.printMenu();

        while (true) {
            System.out.println("Выберите действие:");
            String input = scanner.nextLine();
            int item = Integer.parseInt(input);
            if (item == 5) break;
            // Interface-segregation-principle - большой интерфейс разделен на маленькие
            switch (item) {
                case 1:
                    store.printCatalog();
                    break;
                case 2:
                    addInBasket();
                    break;
                case 3:
                    printBasket();
                    break;
                case 4:
                    checkout();
                    break;
                default:
                    System.out.println("Ошибка ввода! Повторите ввод еще раз.");
            }
        }
    }

    private static void addInBasket() {
        while (true) {
            System.out.println("0 - ВЫХОД В ОСНОВНОЕ МЕНЮ");
            System.out.println("Введите наименование товара из каталога: ");
            String productName = scanner.nextLine();
            if (productName.equals("0")) {
                store.printMenu();
                break;
            }
            System.out.println("Введите количество товара: ");
            String count = scanner.nextLine();
            int productCount = Integer.parseInt(count);
            Product search = store.catalogSearch(productName);
            if (search != null) {
                order.add(new Basket(search, productCount));
                System.out.println("Товар добавлен в корзину");
            } else {
                System.out.println("Такой товар не найден");
            }
        }
    }

    // принцип DRY - повторяющийся код вывода корзины вынесен в отдельный метод
    private static void printBasket() {
        if (order.isEmpty()) {
            System.out.println("Ваша корзина пуста");
        } else {
            totalSum = 0;
            for (int i = 0; i < order.size(); i++) {
                totalSum += order.get(i).getProduct().getPrice() * order.get(i).getCount();
                System.out.println(i + 1 + ". " + order.get(i));
            }
        }
    }

    private static void checkout() {
        if (totalSum >= MIN_ORDER_AMOUNT) {
            Random random = new Random();
            printBasket();
            System.out.println("Заказ № " + random.nextInt(10_000) + " оформлен. Общая сумма заказа: " + totalSum);
        } else {
            System.out.println("~ Минимальная сумма заказа должна быть не менее " + MIN_ORDER_AMOUNT + " руб. ~");
        }
    }
}
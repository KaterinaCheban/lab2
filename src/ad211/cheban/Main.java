package ad211.cheban;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(5);
        cart.plusItem(new Item("Мыло", 50));
        cart.plusItem(new Item("Зубная щетка", 65));
        cart.plusItem(new Item("Стиральный порошок", 250));
        cart.plusItem(new Item("Зубная паста", 90));
        cart.plusItem(new Item("Декоративный стакан", 55));
        System.out.print("\t\t\tЧек\n");
        System.out.print("Мыло\t\t\t\t\t\t50\n");
        System.out.print("Зубная щетка\t\t\t\t65\n");
        System.out.print("Стиральный порошок\t\t\t250\n");
        System.out.print("Зубная паста\t\t\t\t90\n");
        System.out.print("Декоративный стакан\t\t\t55\n");
        System.out.println("\nСумма товаров в корзине: " + cart.Sum());
        cart.raise_the_price(15);
        System.out.println("Сумма товаров в корзине (с повышением цены на 15%): " + cart.Sum());
        cart.lower_the_price(30);
        System.out.println("Сумма товаров в корзине: (с понижением цены на 30%): " + cart.Sum());
    }
}
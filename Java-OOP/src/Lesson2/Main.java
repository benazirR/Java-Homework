package Lesson2;

import Lesson2.Classes.Actor;
import Lesson2.Classes.Human;
import Lesson2.Classes.Market;
import Lesson2.Classes.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> MarktetProducts = new ArrayList<>(List.of(new Product("Apple", 10, LocalDate.now(), 44),
                                                        new Product("Banana", 20, LocalDate.now(), 55),
                                                        new Product("Grapes", 30, LocalDate.now(), 66),
                                                        new Product("Orange", 30, LocalDate.now(), 77),
                                                        new Product("Mango", 30, LocalDate.now(), 88),
                                                        new Product("Pineapple", 30, LocalDate.now(), 99)));

        List<Product> tomProductsCart = new ArrayList<>(List.of(new Product("Apple", 10, LocalDate.now(), 4),
                                                        new Product("Banana", 20, LocalDate.now(), 6),
                                                        new Product("Grapes", 30, LocalDate.now(), 7)));

        List<Product> sarahProductsCart = new ArrayList<>(List.of(new Product("Orange", 10, LocalDate.now(), 4),
                                                        new Product("Яблоко", 20, LocalDate.now(), 6),
                                                        new Product("Mango", 30, LocalDate.now(), 7)));

        Actor tom = new Human("Tom", tomProductsCart);
        Actor sarah = new Human("Sarah", sarahProductsCart);

        Market Pyaterochka = new Market();
        // Пополнение склада продуктами
        Pyaterochka.set_products(MarktetProducts);

        // Вход в супермаркет
        Pyaterochka.acceptToMarket(tom);
        Pyaterochka.acceptToMarket(sarah);

        // Выполнение заказов клиентов поочередно
        Pyaterochka.takeOrders();

        // Просмотр остатка продуктов на складе
        System.out.println(Pyaterochka.get_products());
    }
}

package Lesson1;

import Lesson1.HW_impl.HotDrink;
import Lesson1.HW_impl.HotDrinkVendingMachine;
import Lesson1.Impl.BottleOfWater;
import Lesson1.Impl.EPackage;
import Lesson1.Impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024,05,1));
//        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024,05,1),
//                0.5f, EPackage.GLASS.getMaterial(), true);
//
//        VendingMachine vm = new WaterVendingMachine();
//
//        System.out.println("--------------------");
//        System.out.println(vm.getProducts());
//
//        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));
//
//        System.out.println("--------------------");
//        System.out.println(vm.getProducts());
//
//        vm.getProduct("Родники");
//
//        System.out.println("--------------------");
//        System.out.println(vm.getProducts());

        HotDrink tea = new HotDrink("Чай",
                70,
                LocalDate.of(2024,06,24),
                80,
                0.8F);

        HotDrink coffee = new HotDrink("Кофе",
                150,
                LocalDate.now(),
                85,
                0.5F);

        HotDrinkVendingMachine HDvm = new HotDrinkVendingMachine();

        System.out.println("--------------------");
        System.out.println(HDvm.getProducts());

        HDvm.addProducts(List.of(tea, coffee, tea));

        System.out.println("--------------------");
        System.out.println(HDvm.getProducts());

        HDvm.getProduct("Чай", 0.8F, 80);

        System.out.println("--------------------");
        System.out.println(HDvm.getProducts());

        System.out.println("--------------------");
    }
}

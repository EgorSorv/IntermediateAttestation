package task2;

import java.util.List;
import java.util.Scanner;

import static task2.PrintToys.printToys;

public class Change {
    public static void changeChances(List<Toy> toys) {
        Scanner sc = new Scanner(System.in);

        printToys(toys);

        System.out.println("Введите номер игрушки:");
        int search = sc.nextInt();

        for (Toy item: toys) {
            if (search == item.getId()) {
                System.out.println("Введите новый шанс выпадения:");
                int chance = sc.nextInt();

                item.setChance(chance);

                System.out.println("Шанс выпадения был изменен");
            }
        }
    }
}

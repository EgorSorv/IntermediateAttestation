package task2;

import java.util.List;

public class PrintToys {
    public static void printToys(List<Toy> toys) {
        System.out.println("Список игрушек:");

        for (Toy item: toys) {
            System.out.println(item.getId() + ") " + item.getName() + ", " + item.getCount() + " шт, " +
                    item.getChance() + "%");
        }
    }
}

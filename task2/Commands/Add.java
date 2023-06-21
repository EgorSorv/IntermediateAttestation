package task2;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Add {
    public static void addToy(List<Toy> toys) {
        int id = toys.size() + 1;
        Scanner sc = new Scanner(System.in);
        boolean find = false;

        System.out.println("Введите название игрушки:");
        String name = sc.nextLine();

        for (Toy item : toys) {
            if (Objects.equals(item.getName(), name)) {
                item.setCount(item.getCount() + 1);
                find = true;
                System.out.println("Игрушка добавлена");
                break;
            }
        }

        if (!find) {
            System.out.println("Введите количество игрушек:");
            int count = sc.nextInt();

            System.out.println("Введите шанс выпадения:");
            int chance = sc.nextInt();

            toys.add(new Toy(id, name, count, chance));
            System.out.println("Игрушка добавлена");
        }
    }
}

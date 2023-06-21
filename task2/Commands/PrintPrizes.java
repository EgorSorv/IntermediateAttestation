package task2;

import java.util.Queue;

public class PrintPrizes {
    public static void printPrizes(Queue<String> prizes) {
        System.out.println("Список призов:");
        for (String item: prizes) {
            System.out.println(item);
        }
    }
}

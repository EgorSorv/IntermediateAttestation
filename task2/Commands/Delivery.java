package task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Queue;

public class Delivery {
    public static void deliveryToys(Queue<String> prizes) {
        try (FileWriter writer = new FileWriter("task2/prizes.txt", true)) {
            writer.write(Objects.requireNonNull(prizes.poll()) + "\n");
            System.out.println("Приз отправлен победителю");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

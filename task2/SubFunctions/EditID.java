package task2;

import java.util.List;

public class EditID {
    public static void editId(List<Toy> toys) {
        int id = 1;

        for (Toy item: toys) {
            item.setId(id);
            id++;
        }
    }
}

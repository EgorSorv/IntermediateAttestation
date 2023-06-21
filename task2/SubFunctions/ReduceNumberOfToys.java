package task2;

import java.util.List;
import java.util.Objects;

import static task2.EditID.editId;

public class ReduceNumberOfToys {
    public static void reduceNumber(List<Toy> toys, String prize) {
        for (Toy item: toys) {
            if (Objects.equals(item.getName(), prize)) {
                item.setCount(item.getCount() - 1);

                if (item.getCount() == 0) {
                    toys.remove(item);
                    editId(toys);
                }
            }
        }
    }
}

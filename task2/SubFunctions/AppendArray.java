package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendArray {
    protected static Integer[] appendInt(Integer[] arr, int element) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }

    protected static String[] appendStr(String[] arr, String element) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new String[0]);
    }
}

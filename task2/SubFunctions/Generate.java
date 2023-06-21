package task2;

import java.util.Arrays;
import java.util.Random;

public class Generate {
    public static String generate(Random random, String[] names, Integer[] chances) {
        int x = random.nextInt(chances[chances.length - 1]);
        int i = Arrays.binarySearch(chances, x);
        if (i < 0) i = -1 - i;
        return names[i];
    }
}

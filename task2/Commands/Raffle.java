package task2;

import java.util.List;
import java.util.Queue;
import java.util.Random;

import static task2.AppendArray.appendInt;
import static task2.AppendArray.appendStr;
import static task2.Generate.generate;
import static task2.ReduceNumberOfToys.reduceNumber;

public class Raffle {
    public static void raffleToys(List<Toy> toys, Queue<String> prizes) {
        Random random = new Random();

        Integer[] chances = new Integer[0];
        String[] toys_names = new String[0];

        for (Toy item: toys) chances = appendInt(chances, item.getChance());
        for (Toy item: toys) toys_names = appendStr(toys_names, item.getName());

        for (int i = 1; i < chances.length; ++i) {
            chances[i] += chances[i - 1];
        }

        String prize = generate(random, toys_names, chances);

        System.out.println("Вы выйграли игрушку - " + prize + "!");
        prizes.add(prize);

        reduceNumber(toys, prize);
        }
    }

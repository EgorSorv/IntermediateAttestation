package task2;

public class Toy extends Product {
    private int count;
    private int chance;

    public Toy(int id, String name, int count, int chance) {
        super(id, name);
        this.count = count;
        this.chance = chance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}

import java.util.*;

public class Villager {
    // TODO:Job j;

    // TODO:INVENTORY

    private double health;
    private int age;

    private Villager[] parents = new Villager[2];
    private ArrayList<Villager> children = new ArrayList<Villager>();
    private Value gender;

    public Villager() {

    }

    public Villager(Villager mother, Villager father) {
        parents[0] = father;
        parents[1] = mother;
        age = 0;
    }

    // TODO: Age up
    // TODO: Can Breed
    // TODO: AttempBreed
    // TODO: Eat
    // TODO: UseItem
    // TODO: Add Child

    public enum Value {
        MAX_INVENTORY(10), MALE(0), FEMALE(0), ERROR(-99);

        public int value;

        private Value(int value) {
            this.value = value;
        }
    }

}

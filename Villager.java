import java.util.*;

import Negative.Utility;

public class Villager {
    // TODO:Job j;

    // TODO:INVENTORY

    private double health;
    private int age;

    private Villager[] parents = new Villager[2];
    private ArrayList<Villager> children = new ArrayList<Villager>();
    private Gender gender;

    public Villager() {
        age = 0;
        gender = selectGender();
    }

    public Villager(Villager mother, Villager father) {
        parents[0] = father;
        parents[1] = mother;
        age = 0;
        gender = selectGender();
    }

    public Villager(int age) {
        this.age = age;
        gender = selectGender();
    }

    public Villager(int age, String gender) {
        this.age = age;
        this.gender = Gender.valueOf(gender);
    }

    // TODO: Age up
    // TODO: Can Breed
    // TODO: AttempBreed
    // TODO: Eat
    // TODO: UseItem
    // TODO: Add Child

    /** PUBLIC UTILITY FUNCTIONS **/

    public String toString() {
        return age + ":" + health + ":" + gender + ":" + children.size();
    }

    /** PRIVATE UTILITY FUNCTIONS **/

    /**
     * Selects Gender Randomly
     * 
     * @return A random Gender
     */
    private Gender selectGender() {
        if (Utility.genRandNum(1.0, 0) > 0.5) {
            gender = Gender.M;
        } else {
            gender = Gender.F;
        }
        return gender;
    }

    /**
     * Value Enumeration
     */
    public static enum Value {
        MAX_INVENTORY(10), ERROR(-99);

        public int value;

        private Value(int VALUE) {
            this.value = VALUE;
        }
    }

    /**
     * Gender
     */
    public static enum Gender {
        M, F
    }

}

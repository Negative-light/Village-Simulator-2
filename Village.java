import java.util.ArrayList;
import Negative.*;

public class Village {
  private ArrayList<Villager> villagers = new ArrayList<Villager>();

  public Village() {
    Villager v;
    villagers.add(new Villager(genSettlerAge(), "M"));
    villagers.add(new Villager(genSettlerAge(), "F"));

    for (int i = 0; i < Utility.genRandNum(10, 1); i++) {
      v = new Villager(genSettlerAge());
      System.out.println(v);

    }

  }

  private int genSettlerAge() {
    return Utility.genRandNum(Limits.START_VILLAGER_AGE_MAX.id, Limits.START_VILLAGER_AGE_MIN.id);
  }

  private static enum Limits {
    START_VILLAGER_AGE_MAX(30), START_VILLAGER_AGE_MIN(20);

    private final int id;

    Limits(int id) {
      this.id = id;
    }

  }

  // TODO: Make Villager Class
  // TODO: Make Building Class
  // TODO: PRODUCT Class
}

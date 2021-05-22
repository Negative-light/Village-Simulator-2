
public class VilSim {
    public static void main(String[] args) {
        System.out.println("WELCOME TO Village Simulator 2");
        System.out.println("Writen by Negative_Light");

        System.out.println("THIS IS MALE   " + Villager.Gender.M.name());
        System.out.println("THIS IS FEMALE " + Villager.Gender.F.name());

        Village v = new Village();
        System.out.println("DATA IS IN THE CLIPBOARD");
    }

}

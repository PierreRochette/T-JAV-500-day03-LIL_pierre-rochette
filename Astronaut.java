import chocolate.*;
import planet.*;

public class Astronaut {
    private static int lastId=0;
    private int id;
    private String name;
    private int snacks;
    private String destination;

    public Astronaut(String name) {
        this.name = name;
        this.id = lastId;
        lastId++;
        this.snacks = 0;
        this.destination = null;
        System.out.println(name + " ready for launch!");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public int getSnacks() {
        return snacks;
    }

    public void doActions(Object mission) {
        if (mission == null) {
            System.out.println(name + ": Nothing to do.");
        } else if (mission instanceof planet.Mars) {
            planet.Mars marsMission = (planet.Mars) mission;
            destination = marsMission.getLandingSite();
            System.out.println(name + ": Started a mission!");
        } else if (mission instanceof chocolate.Mars) {
            chocolate.Mars marsMission = (chocolate.Mars) mission;
            int marsId = marsMission.getId();
            System.out.println(name + ": Thanks for this mars number " + marsId);
            snacks++;
        }

        if (destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
}

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
        System.out.println(name + " ready for lunch!");
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
            planet.Mars marsMission  =
        }
    }

}
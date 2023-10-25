import java.util.ArrayList;
import java.util.List;


public class Team {

    private String name;
    private List<Astronaut> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Astronaut astronaut) {
        members.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        members.remove(astronaut);
    }

    public int countMembers() {
        return members.size();
    }

    public void showMembers() {
        if(!members.isEmpty()) {
            System.out.print(name + ": ");
            int i = 0;
            int totalMembers = members.size();
            for (Astronaut astronaut : members) {
                System.out.print(astronaut.getName());
                if (astronaut.getDestination() != null) {
                    System.out.print(" on mission");
                } else {
                    System.out.print(" on standby");
                }
                if (i < totalMembers - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
                i++;

            }
            System.out.println();
        }
    }

}

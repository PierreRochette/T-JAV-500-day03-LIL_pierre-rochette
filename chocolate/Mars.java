package chocolate;

public class Mars {
    private static int lastId=0;
    private final int id;

    public Mars() {
        this.id = lastId;
        lastId++;
    }

    public int getId() {
        return id;
    }

}
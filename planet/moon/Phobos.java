package planet.moon;
import planet.*;

public class Phobos {

    private Mars mars;
    private String landingSite;

    public Phobos(Mars mars, String landingSite) {
        if (mars != null) {
            this.mars = mars;
            this.landingSite = landingSite;
            System.out.println("Phobos placed in orbit.");
        } else {
            this.mars = null;
            this.landingSite = null;
            System.out.println("No planet given.");
        }
    }

    public Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return landingSite;
    }

}

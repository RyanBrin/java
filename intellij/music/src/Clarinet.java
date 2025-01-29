/**
 * Clarinet Class
 */
public class Clarinet extends Woodwind {
    public Clarinet(String musician) {
        super(musician);
    }

    @Override
    public String play() {
        return("wooo");
    }

    public String toString() {
        return super.getMusician() + " plays " + play() + ".";
    }
}

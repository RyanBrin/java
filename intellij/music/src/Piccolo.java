/**
 * Piccolo Class
 */
public class Piccolo extends Woodwind {
    public Piccolo(String musician) {
        super(musician);
    }

    @Override
    public String play() {
        return("chirp");
    }

    public String toString() {
        return super.getMusician() + " plays " + play() + ".";
    }
}

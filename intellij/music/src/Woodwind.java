/**
 * Woodwind Class
 */
public abstract class Woodwind extends Instrument {
    public Woodwind(String musician) {
        super(musician);
    }

    @Override
    public String play() {
        return("windy sound");
    }
}

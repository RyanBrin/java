/**
 * Vocal Class
 */
public abstract class Vocal extends Instrument {
    public Vocal(String musician) {
        super(musician);
    }

    @Override
    public String play() {
        return("la la la");
    }
}

/**
 * Instrument class
 */
public abstract class Instrument {
    protected String musician;

    public Instrument(String musician) {
        this.musician = musician;
    }

    public String getMusician() {
        return musician;
    }

    public abstract String makeSound();
}
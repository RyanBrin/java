/**
 * Instrument class
 */
abstract class Instrument {
   String musician;

    public Instrument(String musician) {
       this.musician = musician;
    }

    public String getMusician() {
       return musician;
    }

    public abstract String play();
}

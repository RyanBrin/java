/**
 * Piccolo class
 */
public class Piccolo extends Instrument {
    public Piccolo(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "chirp chirp";
    }
}
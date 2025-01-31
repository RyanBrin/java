/**
 * Clarinet Class
 */
public class Clarinet extends Instrument {
    public Clarinet(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "wooo wooo";
    }
}
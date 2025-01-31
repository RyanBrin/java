/**
 * Drums class
 */
public class Drums extends Instrument {
    public Drums(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "boom boom";
    }
}
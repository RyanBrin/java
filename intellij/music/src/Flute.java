/**
 * Flute class
 */
public class Flute extends Instrument {
    public Flute(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "whistle whistle";
    }
}

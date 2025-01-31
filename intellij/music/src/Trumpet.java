/**
 * Trumpet class
 */
public class Trumpet extends Instrument {
    public Trumpet(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "toot toot";
    }
}
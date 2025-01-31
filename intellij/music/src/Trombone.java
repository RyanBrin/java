/**
 * Trombone class
 */
public class Trombone extends Instrument {
    public Trombone(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "waa waa";
    }
}
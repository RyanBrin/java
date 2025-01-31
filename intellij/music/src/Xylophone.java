/**
 * Xylophone class
 */
public class Xylophone extends Instrument {
    public Xylophone(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "ding ding";
    }
}
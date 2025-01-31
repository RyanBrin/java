/**
 * Vocal Class
 */
class Vocal extends Instrument {
    public Vocal(String musician) {
        super(musician);
    }

    @Override
    public String makeSound() {
        return "la la la";
    }
}
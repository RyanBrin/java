/**
 * Performance class
 */
public class Performance {
    private String arrangement;
    private Instrument[] musicians;

    public Performance(String arrangement, Instrument... musicians) {
        this.arrangement = arrangement;
        this.musicians = musicians;
    }

    public void playPerformance() {
        System.out.println("🎶 Now performing: \"" + arrangement + "\" 🎶\n");

        for (Instrument musician : musicians) {
            System.out.println(musician.getMusician() + " is playing " + musician.getClass().getSimpleName() + " 🎵: " + musician.makeSound());
        }
    }
}
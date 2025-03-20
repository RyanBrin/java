/*
 * Disk class
 */
class Disk {
    private final int size;

    /**
     * Constructs a Disk object with a given size.
     *
     * @param size The size of the disk.
     */
    public Disk(int size) {
        this.size = size;
    }

    /**
     * Gets the size of the disk.
     *
     * @return The size of the disk.
     */
    public int getSize() {
        return size;
    }
}
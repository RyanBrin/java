/*
 * Project: Puck
 * Author: Ryan Brinkman
 * Date: 11/20/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/puck/
 */

public class TestDisk {
    public static void main(String[] args) {
        Disk[] disks = {
                new Disk(3, 1),
                new Disk(5, 6),
                new Disk(4, 2),
                new Disk(10, 3),
                new Disk(4, 5),
                new Disk(5, 6),
                new Disk(6, 5)
        };

        Disk mainDisk = new Disk(5, 6);

        System.out.println("Main Disk Details:");
        System.out.println("Thickness: " + mainDisk.getThickness());
        System.out.println("Volume: " + mainDisk.getVolume());
        System.out.println("Surface Area: " + mainDisk.getSurfaceArea());
        System.out.println(mainDisk);
        System.out.println();

        double mainDiskVolume = mainDisk.getVolume();
        System.out.println("Comparing the volume of each disk with the main disk:");
        for (int i = 0; i < disks.length; i++) {
            Disk currentDisk = disks[i];
            double currentVolume = currentDisk.getVolume();
            boolean isVolumeEqual = currentVolume == mainDiskVolume;
            System.out.printf("Disk %d: Volume = %.2f (%s to main disk)\n",
                    i + 1, currentVolume, isVolumeEqual ? "Equal" : "Not equal");
        }
    }
}

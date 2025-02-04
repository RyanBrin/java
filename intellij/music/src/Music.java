/*
 * Project: Music
 * Author: Ryan Brinkman
 * Date: January 29, 2025
 *
 * Description:
 * A simple band program that assigns instruments to musicians and sets up performances.
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/music/
 */

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Instrument bandMember1, bandMember2, bandMember3, bandMember4;

        Scanner scanner = new Scanner(System.in);

        // Assign instruments to band members
        bandMember1 = assignInstrument(scanner);
        bandMember2 = assignInstrument(scanner);
        bandMember3 = assignInstrument(scanner);
        bandMember4 = assignInstrument(scanner);

        System.out.println("\n🎸 Band Members:");
        System.out.println(bandMember1);
        System.out.println(bandMember2);
        System.out.println(bandMember3);
        System.out.println(bandMember4);

        // Select performance
        Performance selectedPerformance = selectPerformance(scanner, bandMember1, bandMember2, bandMember3, bandMember4);

        // Display the chosen performance
        System.out.println("\n🎵 Performance Started:");
        selectedPerformance.playPerformance();

        scanner.close();
    }

    public static Instrument assignInstrument(Scanner scanner) {
        System.out.print("\nEnter band member's name: ");
        String name = scanner.nextLine();

        System.out.println("\n🎼 Instrument Selection:");
        System.out.println("1. Vocal 🎤");
        System.out.println("2. Piccolo 🎶");
        System.out.println("3. Clarinet 🎷");
        System.out.println("4. Trumpet 🎺");
        System.out.println("5. Trombone 🎺");
        System.out.println("6. Drums 🥁");
        System.out.println("7. Xylophone 🎼");
        System.out.println("8. Violin 🎻");
        System.out.println("9. Guitar 🎸");
        System.out.println("10. Saxophone 🎷");
        System.out.println("11. Flute 🎵");
        System.out.println("12. Piano 🎹");

        System.out.print("Select an instrument for " + name + " (1-12): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1": return new Vocal(name);
            case "2": return new Piccolo(name);
            case "3": return new Clarinet(name);
            case "4": return new Trumpet(name);
            case "5": return new Trombone(name);
            case "6": return new Drums(name);
            case "7": return new Xylophone(name);
            case "8": return new Flute(name);
            default:
                System.out.println("Invalid selection. Please try again.");
                return assignInstrument(scanner);
        }
    }

    public static Performance selectPerformance(Scanner scanner, Instrument b1, Instrument b2, Instrument b3, Instrument b4) {
        System.out.println("\n🎼 Performance Selection:");
        System.out.println("1. Solo");
        System.out.println("2. Duet");
        System.out.println("3. Trio");
        System.out.println("4. Quartet");

        System.out.print("Select a performance type (1-4): ");
        String choice = scanner.nextLine();

        System.out.print("Enter the song or arrangement name: ");
        String arrangement = scanner.nextLine();

        switch (choice) {
            case "1":
                return new Performance(arrangement, b1);
            case "2":
                return new Performance(arrangement, b1, b2);
            case "3":
                return new Performance(arrangement, b1, b2, b3);
            case "4":
                return new Performance(arrangement, b1, b2, b3, b4);
            default:
                System.out.println("Invalid selection. Please try again.");
                return selectPerformance(scanner, b1, b2, b3, b4);
        }
    }
}
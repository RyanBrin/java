/*
 * Project: Music
 * Author: Ryan Brinkman
 * Date: January 29, 2025
 *
 * Description:
 *
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/music/
 */

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Instrument bandMember0;
        Instrument bandMember1;
        Instrument bandMember2;
        Instrument bandMember3;

        Scanner scanner = new Scanner(System.in);
        String performanceChoice;

        bandMember0 = assignInstrument();
        bandMember1 = assignInstrument();
        bandMember2 = assignInstrument();
        bandMember3 = assignInstrument();

        System.out.println(bandMember0 + " " + bandMember1 + " " + bandMember2 + " " + bandMember3);
    }

    public static Instrument assignInstrument() {
        String instrumentChoice;
        String name;
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter band member's name: ");
        name = scanner.nextLine();

        System.out.println();

        System.out.println("Instrument Selection");
        System.out.println("1. Vocal");
        System.out.println("2. Piccolo");
        System.out.println("3. Clarinet");

        System.out.print("Select an instrument for " + name + " (1-3): ");
        instrumentChoice = scanner.nextLine();

        switch (instrumentChoice) {
            case "1" -> {
                return new Vocal(name);
            }
            case "2" -> {
                return new Piccolo(name);
            }
            case "3" -> {
                return new Clarinet(name);
            }
            default -> {
                return new Vocal(name);
            }
        }
    }
}

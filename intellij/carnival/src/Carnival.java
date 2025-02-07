/*
 * Project: Carnival
 * Author: Ryan Brinkman
 * Date: January 27, 2025
 *
 * Description:
 * A virtual carnival simulation where players can participate in various game booths.
 * The program allows the creation of different carnival games, enabling players
 * to engage with them through predefined methods. This project provides an
 * interactive and expandable framework for simulating a lively carnival experience.
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/carnival/
 */

public class Carnival {
    public static void main(String[] args) {
        // Creating game booths
        GameBooth balloonDartToss = new GameBooth("Balloon Dart Toss", 2, "Tiger Plush", "Sticker");
        GameBooth giantSquidCatcher = new GameBooth("Giant Squid Catcher", 3, "Giant Squid Skin", "Magical Sword");
        GameBooth whackAMole = new GameBooth("Whack-A-Mole", 1, "Whack-a-Mole Stick", "Puzzle Box");
        GameBooth slotMachine = new GameBooth("Slot Machine", 5, "Slot Machine Ticket", "Lottery Ticket");
        GameBooth candyCaneCrusher = new GameBooth("Candy Cane Crusher", 4, "Candy Cane Stick", "Soda Can");
        GameBooth russianRoulette = new GameBooth("Russian Roulette", 6, "Russian Roulette Bullet", "Smoke Bomb");
        GameBooth treasureHunt = new GameBooth("Treasure Hunt", 7, "Treasure Map Stick", "Treasure Chest");
        GameBooth blackJack = new GameBooth("Blackjack", 8, "Blackjack Card Stick", "Chips");
        GameBooth pokerGame = new GameBooth("Poker Game", 9, "Poker Card Stick", "Chips");
        GameBooth diceGame = new GameBooth("Dice Game", 10, "Dice Stick", "Chips");
        GameBooth gumballMachine = new GameBooth("Gumball Machine", 11, "Gumball Stick", "Chips");
        GameBooth ringToss = new GameBooth("Ring Toss", 2, "Bear Keychain", "Pencil");
        GameBooth magic8Ball = new GameBooth("Magic 8-Ball", 3, "Magic 8-Ball Stick", "Soda Can");
        GameBooth rouletteWheel = new GameBooth("Roulette Wheel", 1, "Roulette Wheel Stick", "Chips");
        GameBooth breakAPlate = new GameBooth("Break A Plate", 1.5, "Pig Plush", "Plastic Dinosaur");

        // Creating players
        Player Ryan = new Player("Ryan", 1000);
        Player Shonda = new Player("Shonda", 37);
        Player Luis = new Player("Luis", 33);
        Player Emily = new Player("Emily", 55);
        Player Alex = new Player("Alex", 40);
        Player Jessica = new Player("Jessica", 62);

        System.out.println("🎡 Welcome to the Carnival! 🎪");
        System.out.println("--------------------------------\n");

        // Simulating gameplay for each game
        playGame(Shonda, balloonDartToss);
        playGame(Luis, ringToss);
        playGame(Ryan, whackAMole);
        playGame(Emily, giantSquidCatcher);
        playGame(Alex, slotMachine);
        playGame(Jessica, candyCaneCrusher);
        playGame(Ryan, russianRoulette);
        playGame(Luis, treasureHunt);
        playGame(Shonda, blackJack);
        playGame(Emily, pokerGame);
        playGame(Alex, diceGame);
        playGame(Jessica, gumballMachine);
        playGame(Ryan, magic8Ball);
        playGame(Luis, rouletteWheel);
        playGame(Shonda, breakAPlate);

        // Printing winnings and player's remaining balance for each player'
        printWinnings(Shonda);
        printWinnings(Luis);
        printWinnings(Ryan);
        printWinnings(Emily);
        printWinnings(Alex);
        printWinnings(Jessica);

        // Print number of prizes given out by each booth
        System.out.println("Number of prizes given out by each booth:");
        System.out.println("Balloon Dart Toss: " + balloonDartToss.getPrizesGiven());
        System.out.println("Giant Squid Catcher: " + giantSquidCatcher.getPrizesGiven());
        System.out.println("Whack-A-Mole: " + whackAMole.getPrizesGiven());
        System.out.println("Slot Machine: " + slotMachine.getPrizesGiven());
        System.out.println("Candy Cane Crusher: " + candyCaneCrusher.getPrizesGiven());
        System.out.println("Russian Roulette: " + russianRoulette.getPrizesGiven());
        System.out.println("Treasure Hunt: " + treasureHunt.getPrizesGiven());

        System.out.println("\n🎊 The carnival fun is over! Thanks for playing! 🎊");
    }

    // Print what each player won and player's remaining balance
    public static void printWinnings(Player player) {
        System.out.println(player.getName() + " won: " + player.getPrizesWon());
        System.out.println("Remaining balance: $" + player.getMoney());
        System.out.println();
    }

    // Helper method to simulate a player playing a game
    public static void playGame(Player player, GameBooth game) {
        System.out.println(player.getName() + " goes to " + game.getName() + ".");
        System.out.println(player.play(game));
        System.out.println();
    }
}

/*
 * Project: Bank
 * Author: Ryan Brinkman
 * Date: 11/13/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/bank/
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Account[] accounts = {
                new Account(25000, "Mario", "Munoz", "110 Glades Rd", "Myron", "FL", "33450"),
                new Account(74230885, "Ryan", "Brinkman", "4825 Granite Dr", "Bismarck", "ND", "58503"),
                new Account(5000, "Alice", "Johnson", "123 Elm St", "Springfield", "IL", "62701"),
                new Account(7500, "Bob", "Smith", "456 Oak St", "Chicago", "IL", "60601"),
                new Account(10000, "Charlie", "Brown", "789 Pine St", "New York", "NY", "10001"),
                new Account(12500, "Diana", "Ross", "101 Maple St", "Los Angeles", "CA", "90001"),
                new Account(15000, "Edward", "Norton", "202 Birch St", "San Francisco", "CA", "94101"),
                new Account(17500, "Fiona", "Apple", "303 Cedar St", "Seattle", "WA", "98101"),
                new Account(20000, "George", "Harrison", "404 Walnut St", "Austin", "TX", "73301"),
                new Account(22500, "Helen", "Mirren", "505 Spruce St", "Denver", "CO", "80201"),
                new Account(25000, "Ian", "McKellen", "606 Chestnut St", "Boston", "MA", "02101"),
                new Account(27500, "Jane", "Doe", "707 Hickory St", "Miami", "FL", "33101"),
                new Account(30000, "Kevin", "Spacey", "808 Sycamore St", "Atlanta", "GA", "30301"),
                new Account(32500, "Laura", "Linney", "909 Willow St", "Dallas", "TX", "75201"),
                new Account(35000, "Mark", "Ruffalo", "1010 Aspen St", "Phoenix", "AZ", "85001"),
                new Account(37500, "Nancy", "Pelosi", "1111 Birch St", "Las Vegas", "NV", "89101"),
                new Account(40000, "Oliver", "Stone", "1212 Cedar St", "Portland", "OR", "97201"),
                new Account(42500, "Pamela", "Anderson", "1313 Elm St", "Minneapolis", "MN", "55401"),
                new Account(45000, "Quentin", "Tarantino", "1414 Oak St", "Detroit", "MI", "48201"),
                new Account(47500, "Rachel", "McAdams", "1515 Pine St", "Philadelphia", "PA", "19101"),
                new Account(50000, "Sam", "Jackson", "1616 Maple St", "Houston", "TX", "77001"),
                new Account(52000, "Sarah", "Williams", "1717 Birchwood Dr", "San Diego", "CA", "92101"),
                new Account(55000, "Tom", "Hanks", "1818 Pineapple Ave", "Los Angeles", "CA", "90024"),
                new Account(58000, "Emma", "Watson", "1919 Cherry Ln", "Chicago", "IL", "60606"),
                new Account(60000, "Chris", "Evans", "2020 Willowbrook Rd", "Miami", "FL", "33140"),
                new Account(65000, "Scarlett", "Johansson", "2121 Oakwood St", "New York", "NY", "10002"),
                new Account(67000, "Daniel", "Craig", "2222 Cedar St", "Boston", "MA", "02110"),
                new Account(70000, "Hugh", "Jackman", "2323 Maplewood Dr", "Chicago", "IL", "60602"),
                new Account(73000, "Natalie", "Portman", "2424 Birchwood Ln", "Seattle", "WA", "98102"),
                new Account(76000, "Johnny", "Depp", "2525 Pine St", "Los Angeles", "CA", "90013"),
                new Account(79000, "Cate", "Blanchett", "2626 Elm Dr", "Austin", "TX", "73302"),
                new Account(82000, "Robert", "Downey", "2727 Oak Dr", "San Francisco", "CA", "94102"),
                new Account(85000, "Meryl", "Streep", "2828 Birch St", "Dallas", "TX", "75202"),
                new Account(88000, "Leonardo", "DiCaprio", "2929 Willow Ave", "Portland", "OR", "97202"),
                new Account(91000, "Nicole", "Kidman", "3030 Sycamore St", "Phoenix", "AZ", "85002"),
                new Account(94000, "Julia", "Roberts", "3131 Maple St", "Miami", "FL", "33150"),
                new Account(97000, "Matt", "Damon", "3232 Pinewood Rd", "Bismarck", "ND", "58504"),
                new Account(100000, "Ben", "Affleck", "3333 Oakwood Ave", "New York", "NY", "10003"),
                new Account(103000, "Will", "Smith", "3434 Cedar Rd", "Chicago", "IL", "60603"),
                new Account(106000, "Denzel", "Washington", "3535 Birch St", "Los Angeles", "CA", "90014"),
                new Account(109000, "Sandra", "Bullock", "3636 Elmwood Ln", "Seattle", "WA", "98103"),
                new Account(112000, "Tom", "Cruise", "3737 Oakwood Dr", "Portland", "OR", "97203"),
                new Account(115000, "Anne", "Hathaway", "3838 Pine Ave", "Phoenix", "AZ", "85003"),
                new Account(118000, "Jessica", "Chastain", "3939 Birchwood Rd", "Dallas", "TX", "75203"),
                new Account(121000, "Brad", "Pitt", "4040 Willow St", "Houston", "TX", "77002"),
                new Account(124000, "Angelina", "Jolie", "4141 Maple Ave", "Bismarck", "ND", "58505"),
                new Account(127000, "Jennifer", "Lawrence", "4242 Cedarwood St", "Austin", "TX", "73303"),
                new Account(130000, "Chris", "Pratt", "4343 Pinewood Dr", "Las Vegas", "NV", "89102"),
                new Account(133000, "Zoe", "Saldana", "4444 Oak Ln", "Miami", "FL", "33160"),
                new Account(136000, "Vin", "Diesel", "4545 Maple St", "Chicago", "IL", "60604"),
                new Account(139000, "Jason", "Statham", "4646 Willowbrook Dr", "New York", "NY", "10004"),
                new Account(142000, "Gwyneth", "Paltrow", "4747 Birchwood Rd", "Portland", "OR", "97204"),
                new Account(145000, "Emily", "Blunt", "4848 Pine St", "Dallas", "TX", "75204"),
                new Account(148000, "Keanu", "Reeves", "4949 Oakwood Dr", "Los Angeles", "CA", "90015"),
                new Account(151000, "Cate", "Blanchett", "5050 Elmwood Ln", "Austin", "TX", "73304"),
                new Account(154000, "Ethan", "Hawke", "5151 Maplewood Dr", "San Francisco", "CA", "94103"),
                new Account(157000, "Edward", "Norton", "5252 Cedar Rd", "Phoenix", "AZ", "85004"),
                new Account(160000, "Tina", "Fey", "5353 Birch Ave", "Miami", "FL", "33170"),
                new Account(163000, "Jason", "Momoa", "5454 Oakwood St", "New York", "NY", "10005"),
                new Account(166000, "Olivia", "Wilde", "5555 Maple Dr", "Portland", "OR", "97205"),
                new Account(169000, "Reese", "Witherspoon", "5656 Pine St", "Dallas", "TX", "75205"),
                new Account(172000, "Hugh", "Grant", "5757 Cedarwood Rd", "Chicago", "IL", "60605"),
                new Account(175000, "Alicia", "Vikander", "5858 Birchwood Ave", "San Francisco", "CA", "94104"),
                new Account(178000, "John", "C. Reilly", "5959 Oakwood St", "Houston", "TX", "77003"),
                new Account(181000, "Sophia", "Loren", "6060 Willow Rd", "Las Vegas", "NV", "89103"),
                new Account(184000, "Ben", "Stiller", "6161 Maplewood St", "Miami", "FL", "33180"),
                new Account(187000, "Mark", "Wahlberg", "6262 Pine Dr", "Chicago", "IL", "60606"),
                new Account(190000, "Jessica", "Alba", "6363 Cedarwood St", "Austin", "TX", "73305"),
                new Account(193000, "Lupita", "Nyong'o", "6464 Oakwood Ave", "Portland", "OR", "97206"),
                new Account(196000, "Matthew", "McConaughey", "6565 Birchwood Ln", "San Francisco", "CA", "94105"),
                new Account(199000, "Charlize", "Theron", "6666 Maple Rd", "Phoenix", "AZ", "85005"),
                new Account(202000, "Paul", "Rudd", "6767 Pinewood Dr", "New York", "NY", "10006"),
                new Account(205000, "Mindy", "Kaling", "6868 Oakwood St", "Dallas", "TX", "75206"),
                new Account(208000, "Joaquin", "Phoenix", "6969 Birchwood Rd", "Miami", "FL", "33190"),
                new Account(211000, "Natalie", "Dormer", "7070 Pine Ave", "Chicago", "IL", "60607")
        };

        Scanner scanner = new Scanner(System.in);
        int totalTransactions = 0;
        int totalDepositCount = 0;
        int totalWithdrawalCount = 0;
        double totalDeposits = 0;
        double totalWithdrawals = 0;

        double totalBankMoneyStart = calculateTotalBankMoney(accounts);
        System.out.println("===========================================================");
        System.out.println("                Welcome to Bank Management                 ");
        System.out.println("===========================================================");
        System.out.println("💰 Total money in the bank at start: " + formatCurrency(totalBankMoneyStart));
        System.out.println("===========================================================");

        while (true) {
            try {
                // Display the account selection menu
                System.out.println("\n=================== Account Selection ===================");
                System.out.printf("%-5s %-20s\n", "ID", "Account Holder");
                System.out.println("---------------------------------------------------------");
                for (int i = 0; i < accounts.length; i++) {
                    System.out.printf("%03d   %-20s\n", (i + 1), accounts[i].getName());
                }
                System.out.println("=========================================================");
                System.out.print("👉 Select an account (001-" + String.format("%03d", accounts.length) + ") or 0 to exit: ");
                int accountIndex = Integer.parseInt(scanner.nextLine()) - 1;

                // Exit if user selects 0
                if (accountIndex == -1) {
                    System.out.println("\n🏦 Thank you for using Bank Management. Goodbye!");
                    break;
                }

                // Validate account selection
                if (accountIndex < 0 || accountIndex >= accounts.length) {
                    System.out.println("\n❌ Invalid account number. Please try again.");
                    continue;
                }

                Account selectedAccount = accounts[accountIndex];

                while (true) {
                    // Display account menu
                    System.out.println("\n================= Account Information ==================");
                    System.out.println("👤 Account ID: " + String.format("%03d", (accountIndex + 1)));
                    System.out.println("🔹 Account Holder: " + selectedAccount.getName());
                    System.out.println("=========================================================");
                    System.out.println("1. Print balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Change address");
                    System.out.println("5. Change phone");
                    System.out.println("6. Back to account selection");
                    System.out.print("👉 Enter your choice (1-6): ");
                    int choice = Integer.parseInt(scanner.nextLine());

                    // Handle user choices
                    switch (choice) {
                        case 1:
                            System.out.println("\n💵 Current Balance: " + selectedAccount.getFormattedBalance());
                            break;
                        case 2:
                            System.out.print("\n💰 Enter deposit amount: $");
                            double depositAmount = Double.parseDouble(scanner.nextLine());
                            selectedAccount.deposit(depositAmount);
                            System.out.println("✅ Deposit successful!");
                            System.out.println("💵 New Balance: " + selectedAccount.getFormattedBalance());
                            totalDeposits += depositAmount;
                            totalDepositCount++;
                            totalTransactions++;
                            break;
                        case 3:
                            System.out.print("\n💸 Enter withdrawal amount: $");
                            double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                            if (selectedAccount.withdrawal(withdrawalAmount)) {
                                System.out.println("✅ Withdrawal successful!");
                                System.out.println("💵 New Balance: " + selectedAccount.getFormattedBalance());
                                totalWithdrawals += withdrawalAmount;
                                totalWithdrawalCount++;
                                totalTransactions++;
                            } else {
                                System.out.println("❌ Insufficient funds. Please try again.");
                            }
                            break;
                        case 4:
                            System.out.println("\n📝 Change Address:");
                            System.out.print("🏠 Enter new street: ");
                            String newStreet = scanner.nextLine();
                            System.out.print("🏙️ Enter new city: ");
                            String newCity = scanner.nextLine();
                            System.out.print("📍 Enter new state: ");
                            String newState = scanner.nextLine();
                            System.out.print("📮 Enter new zip code: ");
                            String newZip = scanner.nextLine();
                            selectedAccount.changeAddress(newStreet, newCity, newState, newZip);
                            System.out.println("✅ Address updated successfully.");
                            totalTransactions++;
                            break;
                        case 5:
                            System.out.print("\n📞 Enter new phone number: ");
                            String newPhone = scanner.nextLine();
                            selectedAccount.changePhone(newPhone);
                            System.out.println("✅ Phone number updated successfully.");
                            totalTransactions++;
                            break;
                        case 6:
                            System.out.println("\n🔙 Returning to account selection...");
                            break;
                        default:
                            System.out.println("\n❌ Invalid choice. Please try again.");
                    }

                    // Exit account menu if user chooses to go back
                    if (choice == 6) break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n❌ Invalid input. Please enter a valid number.");
            }
        }

        double totalBankMoneyFinish = calculateTotalBankMoney(accounts);
        System.out.println("\n===========================================================");
        System.out.println("                    Summary of Transactions               ");
        System.out.println("===========================================================");
        System.out.println("🏦 Total money in the bank at finish: " + formatCurrency(totalBankMoneyFinish));
        System.out.println("🔄 Total number of transactions: " + totalTransactions);
        System.out.println("💰 Total deposits: " + formatCurrency(totalDeposits));
        System.out.println("   ↳ Number of deposit transactions: " + totalDepositCount);
        System.out.println("💸 Total withdrawals: " + formatCurrency(totalWithdrawals));
        System.out.println("   ↳ Number of withdrawal transactions: " + totalWithdrawalCount);
        System.out.println("===========================================================");

        scanner.close();
    }

    private static double calculateTotalBankMoney(Account[] accounts) {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    private static String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(amount);
    }
}
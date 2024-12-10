import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {

    /**
     * The main method to run the Bank Management system.
     * It handles account selection, account operations (deposit, withdrawal, etc.), and generates transaction summaries.
     */
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(2500, "Mario", "Munoz", "110 Glades Rd", "Myron", "FL", "33450", "561-555-1001"),
                new Account(74230346, "Ryan", "Brinkman", "4825 Granite Dr", "Bismarck", "ND", "58503", "701-555-1002"),
                new Account(5000, "Alice", "Johnson", "123 Elm St", "Springfield", "IL", "62701", "217-555-1003"),
                new Account(7500, "Bob", "Smith", "456 Oak St", "Chicago", "IL", "60601", "312-555-1004"),
                new Account(10000, "Charlie", "Brown", "789 Pine St", "New York", "NY", "10001", "212-555-1005"),
                new Account(12500, "Diana", "Ross", "101 Maple St", "Los Angeles", "CA", "90001", "213-555-1006"),
                new Account(15000, "Edward", "Norton", "202 Birch St", "San Francisco", "CA", "94101", "415-555-1007"),
                new Account(17500, "Fiona", "Apple", "303 Cedar St", "Seattle", "WA", "98101", "206-555-1008"),
                new Account(20000, "George", "Harrison", "404 Walnut St", "Austin", "TX", "73301", "512-555-1009"),
                new Account(22500, "Helen", "Mirren", "505 Spruce St", "Denver", "CO", "80201", "303-555-1010"),
                new Account(25000, "Ian", "McKellen", "606 Chestnut St", "Boston", "MA", "02101", "617-555-1011"),
                new Account(27500, "Jane", "Doe", "707 Hickory St", "Miami", "FL", "33101", "305-555-1012"),
                new Account(30000, "Kevin", "Spacey", "808 Sycamore St", "Atlanta", "GA", "30301", "404-555-1013"),
                new Account(32500, "Laura", "Linney", "909 Willow St", "Dallas", "TX", "75201", "214-555-1014"),
                new Account(35000, "Mark", "Ruffalo", "1010 Aspen St", "Phoenix", "AZ", "85001", "602-555-1015"),
                new Account(37500, "Nancy", "Pelosi", "1111 Birch St", "Las Vegas", "NV", "89101", "702-555-1016"),
                new Account(40000, "Oliver", "Stone", "1212 Cedar St", "Portland", "OR", "97201", "503-555-1017"),
                new Account(42500, "Pamela", "Anderson", "1313 Elm St", "Minneapolis", "MN", "55401", "612-555-1018"),
                new Account(45000, "Quentin", "Tarantino", "1414 Oak St", "Detroit", "MI", "48201", "313-555-1019"),
                new Account(47500, "Rachel", "McAdams", "1515 Pine St", "Philadelphia", "PA", "19101", "215-555-1020"),
                new Account(50000, "Sam", "Jackson", "1616 Maple St", "Houston", "TX", "77001", "713-555-1021"),
                new Account(52000, "Sarah", "Williams", "1717 Birchwood Dr", "San Diego", "CA", "92101", "858-555-1022"),
                new Account(55000, "Tom", "Hanks", "1818 Pineapple Ave", "Los Angeles", "CA", "90024", "310-555-1023"),
                new Account(58000, "Emma", "Watson", "1919 Cherry Ln", "Chicago", "IL", "60606", "773-555-1024"),
                new Account(60000, "Chris", "Evans", "2020 Willowbrook Rd", "Miami", "FL", "33140", "305-555-1025"),
                new Account(65000, "Scarlett", "Johansson", "2121 Oakwood St", "New York", "NY", "10002", "212-555-1026"),
                new Account(67000, "Daniel", "Craig", "2222 Cedar St", "Boston", "MA", "02110", "617-555-1027"),
                new Account(70000, "Hugh", "Jackman", "2323 Maplewood Dr", "Chicago", "IL", "60602", "312-555-1028"),
                new Account(73000, "Natalie", "Portman", "2424 Birchwood Ln", "Seattle", "WA", "98102", "206-555-1029"),
                new Account(76000, "Johnny", "Depp", "2525 Pine St", "Los Angeles", "CA", "90013", "323-555-1030"),
                new Account(79000, "Cate", "Blanchett", "2626 Elm Dr", "Austin", "TX", "73302", "512-555-1031"),
                new Account(82000, "Robert", "Downey", "2727 Oak Dr", "San Francisco", "CA", "94102", "415-555-1032"),
                new Account(85000, "Meryl", "Streep", "2828 Birch St", "Dallas", "TX", "75202", "214-555-1033"),
                new Account(88000, "Leonardo", "DiCaprio", "2929 Willow Ave", "Portland", "OR", "97202", "503-555-1034"),
                new Account(91000, "Nicole", "Kidman", "3030 Sycamore St", "Phoenix", "AZ", "85002", "602-555-1035"),
                new Account(94000, "Julia", "Roberts", "3131 Maple St", "Miami", "FL", "33150", "305-555-1036"),
                new Account(97000, "Matt", "Damon", "3232 Pinewood Rd", "Bismarck", "ND", "58504", "701-555-1037"),
                new Account(100000, "Ben", "Affleck", "3333 Oakwood Ave", "New York", "NY", "10003", "212-555-1038"),
                new Account(103000, "Will", "Smith", "3434 Cedar Rd", "Chicago", "IL", "60603", "312-555-1039"),
                new Account(106000, "Denzel", "Washington", "3535 Birch St", "Los Angeles", "CA", "90014", "323-555-1040"),
                new Account(109000, "Sandra", "Bullock", "3636 Elmwood Ln", "Seattle", "WA", "98103", "206-555-1041"),
                new Account(112000, "Tom", "Cruise", "3737 Oakwood Dr", "Portland", "OR", "97203", "503-555-1042"),
                new Account(115000, "Anne", "Hathaway", "3838 Pine Ave", "Phoenix", "AZ", "85003", "602-555-1043"),
                new Account(118000, "Jessica", "Chastain", "3939 Birchwood Rd", "Dallas", "TX", "75203", "214-555-1044"),
                new Account(121000, "Brad", "Pitt", "4040 Willow St", "Houston", "TX", "77002", "713-555-1045"),
                new Account(124000, "Angelina", "Jolie", "4141 Maple Ave", "Bismarck", "ND", "58505", "701-555-1046"),
                new Account(127000, "Jennifer", "Lawrence", "4242 Cedarwood St", "Austin", "TX", "73303", "512-555-1047"),
                new Account(130000, "Chris", "Pratt", "4343 Pinewood Dr", "Las Vegas", "NV", "89102", "702-555-1048"),
                new Account(133000, "Zoe", "Saldana", "4444 Oak Ln", "Miami", "FL", "33160", "305-555-1049"),
                new Account(136000, "Vin", "Diesel", "4545 Maple St", "Chicago", "IL", "60604", "312-555-1050"),
                new Account(139000, "Jason", "Statham", "4646 Willowbrook Dr", "New York", "NY", "10004", "212-555-1051"),
                new Account(142000, "Gwyneth", "Paltrow", "4747 Birchwood Rd", "Portland", "OR", "97204", "503-555-1052"),
                new Account(145000, "Emily", "Blunt", "4848 Pine St", "Dallas", "TX", "75204", "214-555-1053"),
                new Account(148000, "Keanu", "Reeves", "4949 Oakwood Dr", "Los Angeles", "CA", "90015", "323-555-1054"),
                new Account(151000, "Cate", "Blanchett", "5050 Elmwood Ln", "Austin", "TX", "73304", "512-555-1055"),
                new Account(154000, "Ethan", "Hawke", "5151 Maplewood Dr", "San Francisco", "CA", "94103", "415-555-1056"),
                new Account(157000, "Edward", "Norton", "5252 Cedar Rd", "Phoenix", "AZ", "85004", "602-555-1057"),
                new Account(160000, "Tina", "Fey", "5353 Birch Ave", "Miami", "FL", "33170", "305-555-1058"),
                new Account(163000, "Jason", "Momoa", "5454 Oakwood St", "New York", "NY", "10005", "212-555-1059"),
                new Account(166000, "Olivia", "Wilde", "5555 Maple Dr", "Portland", "OR", "97205", "503-555-1060"),
                new Account(169000, "Reese", "Witherspoon", "5656 Pine St", "Dallas", "TX", "75205", "214-555-1061"),
                new Account(172000, "Hugh", "Grant", "5757 Cedarwood Rd", "Chicago", "IL", "60605", "312-555-1062"),
                new Account(175000, "Alicia", "Vikander", "5858 Birchwood Ave", "San Francisco", "CA", "94104", "415-555-1063"),
                new Account(178000, "John", "C. Reilly", "5959 Oakwood St", "Houston", "TX", "77003", "713-555-1064"),
                new Account(181000, "Sophia", "Loren", "6060 Willow Rd", "Las Vegas", "NV", "89103", "702-555-1065"),
                new Account(184000, "Ben", "Stiller", "6161 Maplewood St", "Miami", "FL", "33180", "305-555-1066"),
                new Account(187000, "Mark", "Wahlberg", "6262 Pine Dr", "Chicago", "IL", "60606", "773-555-1067"),
                new Account(190000, "Jessica", "Alba", "6363 Cedarwood St", "Austin", "TX", "73305", "512-555-1068"),
                new Account(193000, "Lupita", "Nyong'o", "6464 Oakwood Ave", "Portland", "OR", "97206", "503-555-1069"),
                new Account(196000, "Matthew", "McConaughey", "6565 Birchwood Ln", "San Francisco", "CA", "94105", "415-555-1070"),
                new Account(199000, "Charlize", "Theron", "6666 Maple Rd", "Phoenix", "AZ", "85005", "602-555-1071"),
                new Account(202000, "Paul", "Rudd", "6767 Pinewood Dr", "New York", "NY", "10006", "212-555-1072"),
                new Account(205000, "Mindy", "Kaling", "6868 Oakwood St", "Dallas", "TX", "75206", "214-555-1073"),
                new Account(208000, "Joaquin", "Phoenix", "6969 Birchwood Rd", "Miami", "FL", "33190", "305-555-1074"),
                new Account(211000, "Natalie", "Dormer", "7070 Pine Ave", "Chicago", "IL", "60607", "773-555-1075")
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
                System.out.println("\n=================== Account Selection ===================");
                System.out.printf("%-5s %-20s\n", "ID", "Account Holder");
                System.out.println("---------------------------------------------------------");
                for (int i = 0; i < accounts.length; i++) {
                    System.out.printf("%03d   %-20s\n", (i + 1), accounts[i].getName());
                }
                System.out.println("=========================================================");
                System.out.print("👉 Select an account (001-" + String.format("%03d", accounts.length) + ") or 0 to exit: ");
                int accountIndex = Integer.parseInt(scanner.nextLine()) - 1;

                if (accountIndex == -1) {
                    System.out.println("\n🏦 Thank you for using Bank Management. Goodbye!");
                    break;
                }

                if (accountIndex < 0 || accountIndex >= accounts.length) {
                    System.out.println("\n❌ Invalid account number. Please try again.");
                    continue;
                }

                Account selectedAccount = accounts[accountIndex];

                while (true) {
                    System.out.println("\n================= Account Information ==================");
                    System.out.println("👤 Account ID: " + String.format("%03d", (accountIndex + 1)));
                    System.out.println("🔹 Account Holder: " + selectedAccount.getName());
                    System.out.println("🏠 Address: " + selectedAccount.getFullAddress());
                    System.out.println("📞 Phone: " + selectedAccount.getPhoneNumber());
                    System.out.println("=========================================================");
                    System.out.println("1. Print balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Change address");
                    System.out.println("5. Change phone");
                    System.out.println("6. Back to account selection");
                    System.out.print("👉 Enter your choice (1-6): ");
                    int choice = Integer.parseInt(scanner.nextLine());

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

                            String newStreet = getValidStreet(scanner);
                            String newCity = getValidCity(scanner);
                            String newState = getValidState(scanner);
                            String newZip = getValidZip(scanner);

                            selectedAccount.changeAddress(newStreet, newCity, newState, newZip);
                            System.out.println("✅ Address updated successfully.");
                            break;
                        case 5:
                            System.out.print("\n📞 Enter new phone number: ");
                            String newPhone = getValidPhoneNumber(scanner);
                            selectedAccount.changePhone(newPhone);
                            System.out.println("✅ Phone number updated successfully.");
                            break;
                        case 6:
                            System.out.println("\n🔙 Returning to account selection...");
                            break;
                        default:
                            System.out.println("\n❌ Invalid choice. Please try again.");
                    }

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

    /**
     * Calculates the total money in the bank by summing up the balances of all accounts.
     * @param accounts An array of Account objects.
     * @return The total money in the bank.
     */
    private static double calculateTotalBankMoney(Account[] accounts) {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    /**
     * Formats the given amount as a currency string.
     * @param amount The amount to format.
     * @return The formatted currency string.
     */
    private static String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(amount);
    }

    /**
     * Validates and prompts for a valid street address.
     * @param scanner The Scanner object used for input.
     * @return A valid street address.
     */
    private static String getValidStreet(Scanner scanner) {
        String street;
        while (true) {
            System.out.print("🏠 Enter new street: ");
            street = scanner.nextLine().trim();
            if (!street.isEmpty()) {
                return street;
            }
            System.out.println("❌ Street address cannot be empty. Please enter a valid address.");
        }
    }

    /**
     * Validates and prompts for a valid city name.
     * @param scanner The Scanner object used for input.
     * @return A valid city name.
     */
    private static String getValidCity(Scanner scanner) {
        String city;
        while (true) {
            System.out.print("🏙️ Enter new city: ");
            city = scanner.nextLine().trim();
            if (!city.isEmpty()) {
                return city;
            }
            System.out.println("❌ City name cannot be empty. Please enter a valid city.");
        }
    }

    /**
     * Validates and prompts for a valid state code (2-letter).
     * @param scanner The Scanner object used for input.
     * @return A valid state code.
     */
    private static String getValidState(Scanner scanner) {
        String state;
        while (true) {
            System.out.print("📍 Enter new state: ");
            state = scanner.nextLine().trim();
            if (state.length() == 2) {
                return state;
            }
            System.out.println("❌ State must be a 2-letter code. Please enter a valid state.");
        }
    }

    /**
     * Validates and prompts for a valid 5-digit zip code.
     * @param scanner The Scanner object used for input.
     * @return A valid zip code.
     */
    private static String getValidZip(Scanner scanner) {
        String zip;
        while (true) {
            System.out.print("📮 Enter new zip code: ");
            zip = scanner.nextLine().trim();
            if (zip.matches("\\d{5}")) {
                return zip;
            }
            System.out.println("❌ Zip code must be 5 digits. Please enter a valid zip code.");
        }
    }

    /**
     * Validates and prompts for a valid phone number in the format XXX-XXX-XXXX.
     * @param scanner The Scanner object used for input.
     * @return A valid phone number.
     */
    private static String getValidPhoneNumber(Scanner scanner) {
        String phone;
        while (true) {
            System.out.print("📞 Enter new phone number: ");
            phone = scanner.nextLine().trim();
            if (phone.matches("\\d{3}-\\d{3}-\\d{4}")) {
                return phone;
            }
            System.out.println("❌ Phone number must be in the format XXX-XXX-XXXX. Please enter a valid number.");
        }
    }
}
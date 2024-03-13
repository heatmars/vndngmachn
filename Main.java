package VndngMachne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Drink("Cola", 15.5),
            new Drink("Water", 10.0),
            new Snack("Chips", 20.0),
            new Snack("Chocolate", 30.75)
        };

        VendingMachine vendingMachine = new VendingMachine(items);

        Scanner scanner = new Scanner(System.in);

        boolean continueOrdering = true;

        while (continueOrdering) {
            vendingMachine.displayItems();

            System.out.print("Enter the item number to purchase: ");
            int itemIndex = scanner.nextInt();
            System.out.print("Insert money: ₱");
            double money = scanner.nextDouble();

            vendingMachine.vendItem(itemIndex, money);

            System.out.print("Do you want to order again? (y/n): ");
            char choice = scanner.next().charAt(0);

            if (choice != 'y') {
                continueOrdering = false;
            }
        }

        System.out.println("Thank you for using the vending machine. Goodbye!");
        scanner.close();
    }
}

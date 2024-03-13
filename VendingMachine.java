package VndngMachne;

// Abstract class Item
abstract class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Child class Drink
class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Drink";
    }
}

// Child class Snack
class Snack extends Item {
    public Snack(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Snack";
    }
}

// VendingMachine class
class VendingMachine {
    private Item[] items;

    public VendingMachine(Item[] items) {
        this.items = items;
    }

    public void displayItems() {
        System.out.println("Available Items:");
        for (Item item : items) {
            System.out.println(item.getName() + " - ₱" + item.getPrice() + " - Type: " + item.getType());
        }
    }

    public void vendItem(int itemIndex, double money) {
        if (itemIndex >= 0 && itemIndex < items.length) {
            Item selectedItem = items[itemIndex];
            if (money >= selectedItem.getPrice()) {
                System.out.println("Enjoy your " + selectedItem.getName() + "! Thank you for using the vending machine.");
            } else {
                System.out.println("Insufficient funds. Please insert more money.");
            }
        } else {
            System.out.println("Invalid item selection.");
        }
    }
}
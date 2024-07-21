package Lists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating Item objects with specified name, quantity, and price
        Item it5 = new Item("Type-C Cable", 20, 1250.75);
        Item it1 = new Item("Nokia Phone", 1, 6750.50);  
        Item it2 = new Item("Power Bank", 5, 10000.00);
        Item it3 = new Item("Type-C Cable", 20, 1250.75);
        Item it4 = new Item("Power Bank", 5, 10000.00);
        Item it6 = new Item("Type-C Cable", 20, 1250.75);

        // Creating an ArrayList to store Item objects
        ArrayList<Item> ar = new ArrayList<>();
        // Creating an ArrayList to store items to be removed
        ArrayList<Item> removeArray = new ArrayList<>();

        // Adding Item objects to the ArrayList
        ar.add(it1);
        ar.add(it2);
        ar.add(it3);
        ar.add(it4);
        ar.add(it6);
        ar.add(it5);

        System.out.println("Original List:");
        printList(ar);

        // Removing an item (it2) using a while loop
        boolean flag = true;
        while (flag) {
            flag = ar.remove(it2);
        }

        System.out.println("\nList after removing 'Power Bank' using while loop:");
        printList(ar);

        System.out.println("--------------------------------------------------------");

        // Adding items to the removeArray
        removeArray.add(it6);
        removeArray.add(it4);

        // Removing all items in removeArray from the main ArrayList
        ar.removeAll(removeArray);

        System.out.println("\nList after removing items in removeArray:");
        printList(ar);
    }

    // Method to print the list of items
    private static void printList(ArrayList<Item> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Item item : list) {
                System.out.println(item);
            }
        }
    }
}

class Item {
    private String name;
    private int qty;
    private double price;

    // Constructor to initialize the item with name, quantity, and price
    Item(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Overriding toString method to provide a custom string representation of the item
    @Override
    public String toString() {
        return "[ Name: " + name + ", Qty: " + qty + ", Price: " + price + " ]";
    }

    // Overriding equals method to compare items based on their name, quantity, and price
    @Override
    public boolean equals(Object ob) {
        boolean flag = ob instanceof Item;

        if (flag) {
            Item it = (Item) ob;
            if ((it.name.equals(this.name)) && (it.qty == this.qty) && (it.price == this.price)) {
                return true;
            }
        }
        return false;
    }
}

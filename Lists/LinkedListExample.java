package Lists;

public class LinkedListExample {
   
        public static void main(String[] args) {
            // Creating a LinkedList object
            LinkedList list = new LinkedList();
    
            // Inserting data into the linked list
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);
    
            // Displaying the contents of the linked list
            list.show();
        }
    }
    
    // Node class to represent each element in the linked list
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node in the list
    }
    
    // LinkedList class to manage the linked list operations
    class LinkedList {
        Node head; // Head of the list
    
        // Method to insert a new node with given data
        public void insert(int data) {
            Node node = new Node(); // Create a new node
            node.data = data; // Set the data for the node
            node.next = null; // Initialize next as null
    
            if (head == null) {
                // If the list is empty, set the new node as the head
                head = node;
            } else {
                // Otherwise, traverse to the end of the list and add the new node
                Node n = head;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node; // Set the next of the last node to the new node
            }
        }
    
        // Method to display the linked list
        public void show() {
            Node node = head; // Start with the head of the list
            while (node != null) {
                // Print the data of each node
                System.out.println(node.data);
                node = node.next; // Move to the next node
            }
        }
    }
    

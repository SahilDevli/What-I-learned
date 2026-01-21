class LinkedList {
    int data;
    LinkedList next;

    // Function to add a node to the list
    public LinkedList add(int newData, LinkedList head) {
        LinkedList temp = new LinkedList();
        temp.data = newData;
        temp.next = null;
        if (head == null) {
            head = temp;  // If head is null, the new node becomes the head
        } else {
            LinkedList tr = head;
            while (tr.next != null) {
                tr = tr.next;  // Traverse to the end of the list
            }
            tr.next = temp;  // Add the new node at the end
        }
        return head;  // Return the updated head
    }

    // Function to delete a node by its value
    public LinkedList delete(int data, LinkedList head) {
        if (head == null) {
            System.out.println("List Underflow!\n");
            return head;  // Return the head unchanged
        }
        
        // Special case: if the node to delete is the head
        if (head.data == data) {
            head = head.next;  // Move head to the next node
            return head;
        }

        LinkedList tr = head;
        while (tr.next != null && tr.next.data != data) {
            tr = tr.next;  // Traverse the list until you find the node to delete
        }
        
        if (tr.next == null) {
            System.out.println("Node not found!\n");
        } else {
            tr.next = tr.next.next;  // Skip the node to delete
        }

        return head;  // Return the updated head
    }

    // Function to display the list
    public void show(LinkedList head) {
        if (head == null) {
            System.out.println("List is empty!\n");
            return;
        } else {
            LinkedList tr = head;
            System.out.println("Linked List: ");
            while (tr != null) {
                System.out.print(tr.data + " ");
                tr = tr.next;  // Traverse the list
            }
            System.out.println();
        }
    }
}

class linkedlist1 {
    public static void main(String[] args) {
        LinkedList head = null;  // Initialize head as null

        LinkedList list = new LinkedList();  // Create a LinkedList instance

        head = list.add(1, head);  // Add nodes and update head
        head = list.add(2, head);
        head = list.add(3, head);
        head = list.add(4, head);

        list.show(head);  // Display the list

        head = list.delete(2, head);  // Delete a node and update head
        list.show(head);  // Display the list after deletion
    }
}

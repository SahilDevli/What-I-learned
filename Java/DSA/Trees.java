import java.util.Scanner;

class Tree {
    String data;
    Tree left, right;

    // Default constructor
    Tree() {
        data = null;
        left = null;
        right = null;
    }

    // Parameterized constructor
    Tree(String data) {
        this.data = data;
        left = null;
        right = null;
    }

    // Method to add data into the tree
    public Tree add(String data, Tree tree) {
        if (tree == null) {
            return new Tree(data);  // If the tree is null, create a new node
        }

        // Compare the current node's data with the new data
        if (tree.data.compareTo(data) > 0) {
            if (tree.left == null) {
                tree.left = new Tree(data);  // Add the new node here
            } else {
                tree.left = add(data, tree.left);  // Recursive call if tree.left is not null
            }
        } else if (tree.data.compareTo(data) < 0) {
            if (tree.right == null) {
                tree.right = new Tree(data);  // Add the new node here
            } else {
                tree.right = add(data, tree.right);  // Recursive call if tree.right is not null
            }
        } else {
            System.out.println("Duplicate key");  // Handle duplicates
        }

        return tree;
    }
    // Pre-order Traversal (Root -> Left -> Right)
    public void preOrder(Tree tree) {
        Tree temp = tree;  // Use a temporary variable to avoid changing the original tree
        if (temp != null) {
            System.out.print(tree.data + " ");  // Visit the root node
            preOrder(tree.left);  // Traverse the left subtree
            preOrder(tree.right);  // Traverse the right subtree
        }
    }

    // public void inOrder(Tree tree) {
    //     if (tree != null) {
    //         inOrder(tree.left);  // Traverse the left subtree
    //         System.out.print(tree.data + " ");  // Visit the root node
    //         inOrder(tree.right);  // Traverse the right subtree
    //     }
    // }
}

class Trees extends Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree1 = null;  // Start with an empty tree (null)

        // Ask the user how many values they want to enter
        System.out.print("How many values do you want to add to the tree? ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Get user input to add values to the tree
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            String value = scanner.nextLine();
            tree1 = tree1 == null ? new Tree(value) : tree1.add(value, tree1);  // Add each value to the tree
        }

        // tree1.inOrder(tree1);
        System.out.println("\nPre-order traversal: ");
        tree1.preOrder(tree1);
        
        scanner.close();
    }
}

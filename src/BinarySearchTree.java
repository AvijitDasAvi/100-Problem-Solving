import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inOrderTraversal() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root != null;

        if (root.key < key)
            return searchRec(root.right, key);

        return searchRec(root.left, key);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        int value;
        System.out.print("Enter the number of value: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter the " + (i + 1) + " no. value: ");
            value = input.nextInt();
            bst.insert(value);
            value = 0;
        }

        System.out.print("\nIn order of the BST: ");
        bst.inOrderTraversal();

        int searchValue;
        System.out.print("\nEnter the searching value: ");
        searchValue = input.nextInt();
        input.close();

        System.out.print("\n\nSearching for value " + searchValue + " : ");
        System.out.println(bst.search(searchValue) ? "Value found" : "Value not found");
    }
}

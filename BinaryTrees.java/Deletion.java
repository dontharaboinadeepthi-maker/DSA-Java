class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Deletion {

    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.data) {
            root.right = delete(root.right, key);
        } else if (key < root.data) {
            root.left = delete(root.left, key);
        } else {
            // Case 1: leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: only one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3: two children
            Node successor = findMin(root.right);   // inorder successor
            root.data = successor.data;             // copy its value here
            root.right = delete(root.right, successor.data); // remove the successor
        }
        return root;
    }

    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Deletion d = new Deletion();
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root = d.delete(root, 50);   // always reassign the returned root
        d.inorder(root);             // 20 30 40 60 70 80
    }
}
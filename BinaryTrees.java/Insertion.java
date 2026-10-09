import java.util.*;
class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Insertion{
    Node insert(Node root,int key){
        if(root == null){
            return new Node(key);
        }
        if(key>root.data){
            root.right = insert(root.right,key);
        }
        if(key<root.data){
            root.left = insert(root.left,key);
        }
        return root;

    }
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        

        Insertion obj = new Insertion();
        Node root = null; 
        System.out.println("Enter the nodes");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            root = obj.insert(root,key);

        }
        System.out.println("Inorder :");
        obj.inorder(root);
    }
}
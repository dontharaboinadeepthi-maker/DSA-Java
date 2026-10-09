class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Inorder{
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args){
        Node root = new Node(28);
        root.right = new Node(98);
        root.left = new Node(22);
        Inorder obj = new Inorder();
        obj.inorder(root);
        

        
        
        

    }
}
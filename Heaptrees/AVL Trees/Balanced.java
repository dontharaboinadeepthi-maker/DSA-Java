import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
public class Balanced{
    int checkheight(Node root){
        if(root == null){
            return -1;
        }
        int right = checkheight(root.right);
        int left = checkheight(root.left);

        return 1+Math.max(right,left);
    }
    boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        int lh = checkheight(root.left);
        int rh = checkheight(root.right);

        int bf = lh-rh;
        if(bf>1||bf<-1){
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);

    }
    public static void main(String[]  args){
        Balanced obj = new Balanced();
        Node root = new Node(202);
        root.right = new Node(823);
        root.left = new Node(28);
        obj.checkheight(root);
        System.out.println(obj.isBalanced(root));
        



    }
}
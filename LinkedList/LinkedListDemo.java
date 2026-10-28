class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void insertAtfront(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    void deleteAtFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head.next == null){
            head = null;
        }
    }
    void insertAtEnd(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newnode;
    }
    void deleteAtEnd(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
    }
    void insertAtpos(int pos,int val){
        Node newnode = new Node(val);
        if(pos<0){
            System.out.println("Invalid posiitiion");
            return;
        }
        if(pos==0){
            if(head == null){
                head = newnode;
                return;
            }
            

        }
        Node curr = head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            curr = curr.next;

        }
        newnode.next = curr.next;
        curr.next = newnode;
    }
    void deleteAtpos(int pos){
        if(pos<0){
            System.out.println("invalid position");
            return;
        }
        if(pos == 0){
            if(head.next == null){
                head = null;
                return;
            }
            
        }
        Node curr = head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;


    }
    void display(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr=curr.next;
        }
    }
}
public class LinkedListDemo{
    public static void main(String[] args){
        LinkedList obj = new LinkedList();
        System.out.println("insert at the front");
        obj.insertAtfront(10);
        obj.insertAtfront(20);
        obj.insertAtfront(30);
        obj.insertAtfront(40);
        obj.insertAtfront(50);
        obj.insertAtfront(60);
        obj.display();
        System.out.println("delete at the end");
        obj.deleteAtFront();
        obj.display();
        System.out.println("insert at the end");
        obj.insertAtEnd(70);
        obj.display();
        System.out.println("delete at the end");
        obj.deleteAtEnd();
        obj.display();
        System.out.println("insert at the pos");
        obj.insertAtpos(2,80);
        obj.display();

        System.out.println("delete at the pos");
        obj.deleteAtpos(3);
        obj.display();




    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next  = null;
    }
}
class Linkedlist{
    Node head;
    void insertAtFront(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
           newnode.next = newnode;
           return;
        }
        Node tail = head;
        while(tail.next!=head){
            tail = tail.next;
        }
        newnode.next = head;
        tail.next = newnode;
        head = newnode;
        
        
    }
    void deleteAtFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node tail = head;
        while(tail.next!=head){
            tail = tail.next;
        }
        head = head.next;
        tail.next = head;
    }
    void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node tail = head;
        while(tail.next.next!=head){
            tail = tail.next;

        }
        tail.next = head;

    }
    void insertAtEnd(int value){
        Node newnode1 = new Node(value);
        if(head == null){
            head = newnode1;
            newnode1.next=newnode1;
            
        }
        Node tail = head;
        while(tail.next!=head){
            tail = tail.next;
        }
        tail.next = newnode1;
        newnode1.next = head;
    }
    void insertAtpos(int pos,int val){
        Node newnode2 = new Node(val);
        if(pos<0){
            System.out.println("invalid position");

        }
        if(pos == 0){
            Node tail = head;
            while(tail.next!=head){
                tail = tail.next;
            }
            newnode.next = head;
            tail.next = newnode2;
            head = newnode2;
            return;

        }
        Node curr = head;
        for(int i=0;i<pos-1;i++){
            curr = curr.next;
            if(curr == head){
                System.out.println("out of range");
                return;
            }
        }
        newnode2.next = curr.next;
        curr.next = newnode2;

    }
}
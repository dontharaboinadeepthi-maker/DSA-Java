class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Linkedlist{
    Node head;
    void insertAtfront(int value){
        Node newnode = new Node(value);
        if(head== null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;


    }
    void deleteFront(){
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev = null;
        }
    }
    void insertAtEnd(int value){
        Node newnode1 = new Node(value);
        if(head == null){
            head = newnode1;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=newnode1;
        newnode1.prev = curr;
    }
    void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;

        }
        curr.next = null;
    }
    void insertAtpos(int pos,int value){
        Node newnode2 = new Node(value);
        if(pos<0){
            System.out.println("invalid position");
            return;
        }
        if(pos ==0){
            if(head == null){
                head = newnode2;
                return;
            }
            newnode2.next = head;
            head.prev = newnode2;
            head = newnode2;
            return;

            
        }
        Node curr = head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            curr = curr.next;

        }
        
        newnode2.next = curr.next;
        newnode2.prev = curr;
        curr.next.prev = newnode2;
        curr.next= newnode2;
    }
    void deleteAtpos(int pos){
        if(pos<0){
            System.out.println("invalid position");
            return;
        }
        if(pos ==0){
            System.out.println("the list is empty");
            return;
        }
        Node curr = head;
        for(int i=0;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        curr.next.prev = curr;
    }
    void display(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
class DoubleLinkedlist{
    public static void main(String[] args){
        Linkedlist obj = new Linkedlist();
        System.out.println("insert the first elements");
        obj.insertAtfront(10);
        obj.insertAtfront(20);
        obj.insertAtfront(30);
        obj.insertAtfront(40);
        obj.insertAtfront(50);
        obj.insertAtfront(60);
        obj.insertAtfront(70);
        obj.insertAtfront(80);
        obj.insertAtfront(90);
        System.out.println("delete the elements from the be front");
        obj.deleteFront();
        obj.deleteFront();
        System.out.println("insert at the end");
        obj.insertAtEnd(100);
        obj.insertAtEnd(110);
        System.out.println("insert at the front");
        obj.deleteAtEnd();
        System.out.println("inset at the given position");
        obj.insertAtpos(2,120);
        System.out.println("delete at the given position");
        obj.deleteAtpos(3);
        obj.display();






    }
}

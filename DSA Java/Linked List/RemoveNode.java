public class RemoveNode{
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node Head;
    static Node Tail;
    static int size = 0;
    void AddAtFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }
    void AddAtLast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }
    void AddAtMiddle(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeLL(int idx) {
    if (Head == null) return; // empty list
    if (idx == 0) { // remove head
        Head = Head.next;
        if (Head == null) Tail = null; // list became empty
        return;
    }

    Node temp = Head;
    int i = 0;
    while (i < idx - 1 && temp.next != null) {
        temp = temp.next;
        i++;
    }

    if (temp.next == null) return; // index out of range

    // If removing the last node
    if (temp.next.next == null) {
        temp.next = null;
        Tail = temp; // update tail
    } else {
        temp.next = temp.next.next;
    }
    size--;
}

    void printLL(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String s[]){
        RemoveNode ll = new RemoveNode();
        ll.AddAtFirst(1);
        ll.AddAtLast(3);
        ll.AddAtLast(4);
        ll.AddAtMiddle(1,2);
        ll.AddAtLast(5);
        ll.printLL();
        System.out.println("Size is "+size);
        ll.removeLL(2);
        System.out.println("After remove");
        ll.printLL();
        System.out.println("Size is "+size);
    }
}
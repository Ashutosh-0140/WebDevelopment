public class DoubleLL{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //add last
    public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}

    //addMiddle
    public void removeFirst(){
        if(head == null){
            System.out.println("No data;");
        }
        if(head.next == null){
            head = tail = null;
        }
        head = head.next;
        head.prev = null;
        size--;
        return;
    }
    //add last
    public void removeLast(){
        if(head == null){
            System.out.println("No data;");
        }
        if(head.next == null){
            head = tail = null;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        tail = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //print
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty list.");
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //public void rotated by k position
    

    public static void main(String s[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.print();
        dll.addLast(2);
        dll.print();
        dll.addLast(3);
        dll.print();
        dll.addLast(4);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();
        //System.out.println(+size);
    }
}
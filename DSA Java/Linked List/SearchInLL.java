public class SearchInLL{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node Head;
    private Node Tail;
    private int size = 0;

    public void insertLL(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head = Tail = newNode;
        }
        else if(Head == Tail){
            Head.next = newNode;
            Tail = newNode;
        }
        else{
            newNode.next = Head;
            Head = newNode;
        }
        size++;
    }

    //Iterative search
    public void itrSearchLL(int key){
        Node temp = Head;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Key found.");
                return;
            }
            else{
                temp = temp.next;
            }
        }
        System.out.println("Element not found");
    }

    public int helper(Node Head, int key){
        if(Head == null){
            return -1;
        }
        if(Head.data == key){
            return 1;
        }
        int idx = helper(Head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    //Recursive Search
    public int recSearch(int key){
        return helper(Head, key);
    }
    public static void main(String s[]){
        SearchInLL s1 = new SearchInLL();
        s1.insertLL(1);
        s1.insertLL(2);
        s1.insertLL(3);
        System.out.println("Found at index "+s1.recSearch(1));
    }
}
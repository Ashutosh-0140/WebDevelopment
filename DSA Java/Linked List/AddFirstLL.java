class AddFirstLL{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size =0;
    public void AddAtFirst(int data){
        //Step 1 Create new node
        Node newNode = new Node(data);
        size++;
        //special condetion if the LL is null now
        if(Head == null){
            Head= Tail = newNode;
            return;
        }

        //Step 2 Link the new node at first i.e current head
        newNode.next = Head;

        //Step 3 Update the head
        Head = newNode;

    }

    public void AddAtLast(int data){
        //Step 1 create new node
        Node newNode = new Node(data);
        size++;
        //if the LL is currently null
        if(Head == null){
            Head = Tail = newNode;
            return;
        }
        //Step 2 link the last node i.e with current Tail
        Tail.next = newNode;
        //make the node Tail
        Tail = newNode;
    }
    public void AddAtMiddle(int idx, int data){
        if (idx == 0) {
            AddAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;
        //Set the cursor where to insert the data
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //Now the Cursor at that point where the data to be insert
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void printLL(){
        //make a new Node to point at first
        Node temp = Head;
        //traverse using while loop
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
    public static void main(String s[]){
        AddFirstLL ll = new AddFirstLL();
        ll.AddAtFirst(1);
        ll.AddAtLast(3);
        ll.AddAtLast(4);
        ll.AddAtMiddle(1,2);
        ll.AddAtLast(5);
        ll.printLL();
        
        System.out.println("Size of LL "+size);
    }
}
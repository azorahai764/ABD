package ABD.LinkedList.RecSearch;

public class Main {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newnode;
            return;
        }
        newnode.next = Head;
        Head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newnode;
            return;
        }
        Tail.next = newnode;
        Tail = newnode;
    }

    public void addMid(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=Head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        Node prev=Head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val=Tail.data;
        prev.next=null;
        Tail=prev;
        size--;
        return val;
    }

    //Recursive Search functions
    public int helper(Node Head, int key){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }
        int idx=helper(Head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(Head,key);
    }

    public void printList() {
        if (Head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null \n");
    }

    public static void main(String[] args) {
        Main l=new Main();
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(4);
        l.addLast(5);
        l.addMid(2,3);
        l.printList();
        System.out.println("Size: "+l.size);
        l.removeFirst();
        l.printList();
        System.out.println("Size: "+l.size);
        l.removeLast();
        l.printList();
        System.out.println("Size: "+l.size);
        System.out.println(l.recSearch(3));

    }
}

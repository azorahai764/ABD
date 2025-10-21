package ABD.LinkedList.CheckPalindrome;

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

//    public void addMid(int idx, int data){
//        if(idx==0){
//            addFirst(data);
//            return;
//        }
//        Node newnode=new Node(data);
//        size++;
//        Node temp=Head;
//        int i=0;
//        while(i<idx-1){
//            temp=temp.next;
//            i++;
//        }
//        newnode.next=temp.next;
//        temp.next=newnode;
//    }

    public Node findMid(Node Head){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(Head==null || Head.next==null){
            return true;
        }
        Node mid=findMid(Head);

        Node curr=mid;
        Node prev=null;
        while (curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=Head;
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        l.addLast(2);
        l.addLast(1);
        l.printList();
        System.out.println(l.checkPalindrome());

    }
}
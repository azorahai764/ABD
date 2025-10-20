package ABD.LinkedList.Intro;


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

        public void addFirst(int data) {
            Node newnode = new Node(data);
            if (Head == null) {
                Head = Tail = newnode;
                return;
            }
            newnode.next = Head;
            Head = newnode;
        }

        public void addLast(int data) {
            Node newnode = new Node(data);
            if (Head == null) {
                Head = Tail = newnode;
                return;
            }
            Tail.next = newnode;
            Tail = newnode;
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
            System.out.print("null");
        }


    public static void main(String[] args) {
        Main l=new Main();
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(3);
        l.addLast(4);
        l.printList();
    }
}
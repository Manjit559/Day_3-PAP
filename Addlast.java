class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class Main {

    static Node insertAtEnd(Node head, int newData)
    {
        Node newNode = new Node(newData);

        if (head == null) {
            return newNode;
        }
        
        
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;

        return head;
    }

    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        head = insertAtEnd(head, 1);
        printList(head);
    }
}

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class Main {
      
    static Node reverseList(Node head) {
          
        Stack<Node> stack = new Stack<>();

        Node curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        if (!stack.isEmpty()) {
            head = stack.pop();
            curr = head;

            while (!stack.isEmpty()) {
              
                curr.next = stack.pop();
                
                curr = curr.next;
            }

            curr.next = null;
        }

        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
          
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}

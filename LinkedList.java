class Node {
    int data;
    Node next;
}

public class LinkedList {
    Node createNode(int data, Node head) {
        Node obj = new Node();
        obj.data = data;
        obj.next = head;

        if (head == null) {
            return obj;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = obj;
            return head;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Node head = null;
        for (int i = 1; i <= 2; i++) {
            head = ll.createNode(i, head);
        }
        Node t = head;
        while (t.next != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

}


import java.util.*;
public class Loop {
    public static void main(String[] args) {

        //Creating random nodes
        Node head = new Node(4);
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        Node node3 = new Node(8);
        Node node4 = new Node(6);
        Node node5 = new Node(12);
        Node node6 = new Node(9);

        //Creating a circular linked list
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;


        Node answer = circle(head);
        System.out.println(answer.data);
    }

    public static Node circle(Node head) {
        HashSet<Node> set = new HashSet<Node>();
        Node curr = head;

        while (curr != null) {
            if (set.contains(curr)) {
                return curr;
            }
            else {
                set.add(curr);
            }
            curr = curr.next;
        }

        System.out.println("The list isn't circular");
        return curr;
    }

}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        Node next = null;
    }
}



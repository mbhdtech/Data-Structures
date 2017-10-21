public class Solution{
    public static void main(String[] args){

        Node head1 = new Node(2);
        addNode(head1,4);
        addNode(head1,3);

        Node head2 = new Node(5);
        addNode(head2,6);
        addNode(head2,4);

        Node answer = sumNodes(head1, head2);
        printNodes(answer);


    }


    public static Node sumNodes(Node list1, Node list2){
        int num1 = nodesNumber(list1);
        int num2 = nodesNumber(list2);

        int sum = num1 + num2;
        String numStr = String.valueOf(sum);
        int counter = numStr.length();

        Node newList = new Node(Character.getNumericValue(numStr.charAt(--counter)));

        while(counter > 0) {

            addNode(newList, Character.getNumericValue(numStr.charAt(--counter)));
        }
        return newList;
    }

    public static int nodesNumber(Node head){
        Node temp = head;
        int exponent;
        int multiplier = 10;
        int size = 0;
        int value = 0;

        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        temp = head;

        while(temp != null){
            value = value + (int)(Math.pow( multiplier, size) * temp.data);
            size--;
            temp = temp.next;
        }
        System.out.println(value);
        return value;
    }


    public static void printNodes(Node head){
       Node temp = head;

       while(temp != null){
           System.out.print(temp.data);
           temp = temp.next;
       }
    }

    public static void addNode(Node head, int num){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(num);
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
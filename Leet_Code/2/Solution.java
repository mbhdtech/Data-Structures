public class Solution{
    public static void main(String[] args){
        //2 -> 4 -> 3
        Node head = new Node(2);
        addNode(head, 4);
        addNode(head, 3);

        //5 -> 6 -> 4
        Node head2 = new Node(5);
        addNode(head2, 6);
        addNode(head2, 4);


        //addTwoNumbers(head, head2);
        Node answer = addTwoNumbers(head, head2);
        printNodes(answer);
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node answer = new Node(0);
        int sum1 = 0;
        int sum2 = 0;
        int list1Size = listSize(l1) - 1; // Denotes the highest power in the list based on decimal places
        int list2Size = listSize(l2)- 1; // Same for second list

        Node curr1 = l1;
        Node curr2 = l2;

        while(curr1 != null){
            sum1 += curr1.data * Math.pow(10, (list1Size)--);
            curr1 = curr1.next;
        }
        while(curr2 != null){
            sum2 += curr2.data * Math.pow(10, (list2Size)--);
            curr2 = curr2.next;
        }

        int totalSum = sum1 + sum2;
        String parsedSum = String.valueOf(totalSum);

        for(int i = parsedSum.length()-1; i >= 0; i--){
            if(i == parsedSum.length()-1){
                char character = parsedSum.charAt(i);
                answer = new Node(Character.getNumericValue(character));
            }
            else {
                char character = parsedSum.charAt(i);
                addNode(answer, Character.getNumericValue(character));
            }
        }
        return answer;
    }

    public static int listSize(Node head){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static void printNodes(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void addNode(Node head, int data){
        Node node = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
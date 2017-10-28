
public class Solution{
    public static void main(String[] args){

        Node head = new Node(1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        addNode(head, 8);
        addNode(head, 11);

        Node head2 = new Node(6);
        addNode(head2, 7);
        addNode(head2, 9);
        addNode(head2, 10);
        addNode(head2, 10);


        Node list = merge(head, head2);
        printNodes(list);


    }


    public static Node merge(Node h1, Node h2){
        Node temp1 = h1;
        Node temp2 = h2;
        int num = 0;
        Node list = null;


        //Edge case
        if(temp1 == null || temp2 == null){
            System.out.println("Invalid Input");
            return h1;
        }

        //We check to see which node has the least value first
        if(temp1.data < temp2.data){
            num = temp1.data;
            temp1 = temp1.next;
        }

        else{
            num = temp2.data;
            temp2 = temp2.next;
        }

        // Create a head node for the new list
        list = new Node(num);


        //While one of the nodes is at least not equal to null
        while(temp1 != null || temp2 != null){

            //If both lists still have nodes in them
            if(temp1 != null && temp2 != null){

                //check to see which one is less
                if(temp1.data < temp2.data){
                    addNode(list, temp1.data);
                    temp1 = temp1.next;
                }

                if(temp2.data < temp1.data){
                   addNode(list, temp2.data);
                   temp2 = temp2.next;
                }
            }

            //If List2 is empty
            if(temp2 == null && temp1 != null){
                addNode(list, temp1.data);
                temp1 = temp1.next;
            }

            //If list1 is empty
            if(temp1 == null && temp2 != null){
                addNode(list, temp2.data);
                temp2 = temp2.next;
            }
        }

        return list;

    }


    




    public static void addNode(Node head, int num){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(num);

    }


    public static void printNodes(Node head){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }



}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
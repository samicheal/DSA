package datastructures;

public class CustomLinkedList {

    public static void main(String [] args){
        //new linked list
        CustomLinkedList test = new CustomLinkedList();

        test.head = new CustomLinkedList.Node(5);
        Node two = new Node(9);
        Node three = new Node(11);

        //create linked list
        test.head.next = two;
        two.next = three;

        /**add new node at top of list
            //test.push(3);
             //test.push(1);
         **/

        /**inserts node after a specific node
        test.insertAfter(test.head, 3);
         */

        //print linked list
        test.printList();
    }

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * print list
     */
    public void printList(){
        Node n = head;
        //traverse list
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    /**
     * add node to top of list
     * Time complexity of push() is O(1)
     */
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /** This function inserts a new node after the given prev_node.
     * Time complexity of insertAfter() is O(1)
     */
    public void insertAfter(Node prevNode, int newData)
    {
        //check if list is empty
        Node newNode = new Node(newData);
        if(head == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

        /**
         * Node class
         */
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }
    }
}


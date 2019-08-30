package datastructures;

public class CustomLinkedList {

    Node head;

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
     */
    public void push(int data){
        //create new node
        Node newNode = new Node(data);
        //check if head is null
        if(head == null)
            head = newNode;
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

    public static void main(String [] args){
        //new linked list
        CustomLinkedList test = new CustomLinkedList();

        test.head = new CustomLinkedList.Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        //create linked list
        test.head.next = two;
        two.next = three;

        //print linked list
        test.printList();
    }
}


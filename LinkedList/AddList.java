package LinkedList;

import java.util.LinkedList;

public class AddList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public void addmiddle(int data, int idx){
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public static void main(String[] args) {
        AddList ll = new AddList();
        //ll.printList();
        ll.addFirst(2);
        //ll.printList();
        ll.addFirst(1);
        //ll.printList();
        ll.addLast(3);
        //ll.printList();
        ll.addLast(4);
        //ll.printList()
        ll.addmiddle(9, 2);
        ll.printList();



    }

}

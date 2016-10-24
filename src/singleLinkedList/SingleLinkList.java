package singleLinkedList;

/**
 * Created by tjsun on 10/23/16.
 */
public class SingleLinkList {
    private Node head = null;

    public void insertList(String data) {
        Node node = new Node(data);
            node.setNext(head.getNext());
            head.setNext(node);
    }

    public String getData(String data) {
        if (head == null) {
            System.out.println("This link list is empty!");
            return null;
        }
        Node node = head;
        while (node.getNext() != null) {
            if (node.getData().equals(data)) {
                System.out.println("Find the data!");
                break;
            }
            node = node.getNext();
        }
        return node.getData();
    }

    public void reverse() {
        Node node = this.head;
        Node previousNode = null;
        Node nextNode;

        while (node != null) {
            nextNode = node.getNext();
            node.setNext(previousNode);
            previousNode = node;
            node = nextNode;
        }
    }
}

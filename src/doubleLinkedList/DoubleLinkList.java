package doubleLinkedList;

/**
 * Created by tjsun on 10/24/16.
 */
public class DoubleLinkList {
    private Node head = null;

    public void insertNode(String data) {
        Node node = new Node(data);
        node.setNext(head.getNext());
        node.setPrevious(head);
        head.getNext().setPrevious(node);
        head.setNext(node);
    }

    public void getNode(String data) {
        Node node = head;
        while (node.getNext() != null) {
            if (data.equals(node.getData())) {
                System.out.println("Find this node");
                break;
            }
            node = node.getNext();
        }
    }

    public Node reverse() {
        if (head == null) {
            return null;
        }
        Node node = head;
        Node next;
        while (node != null) {
            next = node.getNext();
            node.setNext(node.getPrevious());
            node.setPrevious(next);
            if (next == null) {
                head = node;
            }
            node = next;
        }
        return head;
    }
}

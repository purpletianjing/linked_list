package doubleLinkedList;

/**
 * Created by tjsun on 10/24/16.
 */
public class Node {
    private Node previous;
    private Node next;
    private String data;

    public Node(String data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> previous;
    Node(){
        next=null;
        previous=null;
        data=null;
    }
    Node(E data) {
        this(data, null, null);
    }
    Node(E data, Node<E> next, Node<E> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    E getData() {
        return data;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
    public Node<E> getPrevious() {
        return previous;
    }
    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
    public void setData(E data) {
        this.data = data;
    }
    public Node<E> getNext() {
        return next;
    }
}
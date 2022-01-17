public class MyNode<E> {
    private E value;
    private MyNode next;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode() {
    }

    public MyNode(E value, MyNode next) {
        this.value = value;
        this.next = next;
    }
    public MyNode(E value) {
        this.value = value;
    }
}

public class MyLinkedList<E> {
    private final MyNode head = new MyNode<>();
    private int size = 0;

    public MyLinkedList() {
    }

    public void remove(int index){
        if (index <0 || index > size)
            return;
        MyNode before = get(index - 1);
        MyNode after = get(index + 1);
        before.setNext(after);
        size--;
    }
    public void remove(){
        remove(size-1);
    }
    public void remove(E element){
        remove(indexOf(element));
    }

    public int indexOf(E element) {
        MyNode node = head;
        int index = -1;
        while (node.getNext() != null) {
            node = node.getNext();
            index++;
            if (node.getValue().equals(element))
                return index;
        }
        return -1;
    }

    public void add(MyNode node) {
        getTail().setNext(node);
        size++;
    }

    public void add(int index, MyNode node) {
        if (index < 0)
            index = 0;
        if (index > size)
            index = size;
        MyNode before = get(index - 1);
        MyNode after = get(index);
        before.setNext(node);
        node.setNext(after);
        size++;
    }

    public void addFirst(E element){
        add(0, element);
    }
    public void addLast(E element){
        add(size, element);
    }
    public void add(E element) {
        add(new MyNode(element));
    }

    public void add(int index, E element) {
        add(index, new MyNode(element));
    }

    public MyNode getTail() {
        MyNode node = head;
        while (node.getNext() != null)
            node = node.getNext();
        return node;
    }

    public MyNode get(int index) {
        if (index < 0) return head;
        MyNode node = head;
        for (int i = 0; i <= index; i++) {
            node = node.getNext();
            if (node == null) return node;
        }
        return node;
    }

    public int getSize() {
        return size;
    }
    public void printList(String msg){
        System.out.printf("---%s---\n", msg);
        for (int i = 0; i < getSize(); i++) {
            System.out.println(get(i).getValue());
        }
        System.out.println("---------------------");
    }
    public void printList(){
        printList("---------------");
    }
}

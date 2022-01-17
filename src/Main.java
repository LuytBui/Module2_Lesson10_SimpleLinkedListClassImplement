public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.printList("init list");

        list.add(0, "stst");
        list.addFirst("addFirst");
        list.add("e");
        list.add(10, "add to #10");
        list.addLast("addLast");
        list.printList("add some elements");

        System.out.printf("index of \"b\" %d\n", list.indexOf("b"));

        list.remove("c");
        list.remove("d"); // khong tim thay, list duoc giu nguyen
        list.remove(0);
        list.remove();
        list.remove();
        list.printList("remove some elements");
    }
}

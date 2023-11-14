package modul9;

public class MyLinkedList {
    private Node head; // Перший елемент списку
    private Node tail; // Останній елемент списку
    private int size;  // Розмір списку

    public MyLinkedList() { //конструктор
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = getNode(index);
        Node previous = current.getPrevious();
        Node next = current.getNext();

        if (previous != null) {
            previous.setNext(next);
        } else {
            head = next;
        }

        if (next != null) {
            next.setPrevious(previous);
        } else {
            tail = previous;
        }

        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node node = getNode(index);
        return node.getValue();
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    private class Node {
        private Object value;
        private Node next;
        private Node previous;

        public Node(Object value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }

        public Object getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add("dfdfdf");


    }
}
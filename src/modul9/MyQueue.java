package modul9;

public class MyQueue {
    private Object[] elements;
    private int size;
    private final int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        elements[size] = value;
        size++;
    }

    public void clear() {
        elements = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[0];
    }

    public Object poll() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object firstElement = elements[0];
        // Зміщуємо всі елементи на одну позицію вліво
        System.arraycopy(elements, 1, elements, 0, size - 1);
        elements[size - 1] = null; // Звільняємо останній елемент
        size--;
        return firstElement;
    }


}

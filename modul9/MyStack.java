package modul9;

public class MyStack {
    private final Object[] elements;
    private int size;
    private final int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }

    public void push(Object value) {
        if (size == capacity) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.out.println(elements);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null;
        System.out.println(elements);
        size--;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object topElement = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return topElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.remove(3);

    }
}

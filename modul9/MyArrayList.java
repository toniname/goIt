package modul9;

import java.util.Arrays;

public class MyArrayList {

    private Object[] array;
    private int size;

    public MyArrayList(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    public void add(Object value) {//
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;

    }

    void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Неправильний індекс");
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        Object[] newArray = new Object[array.length -1];
        array[array.length - 1] = null;
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];

        }
        System.out.println(Arrays.toString(newArray));
    }

    void clear() {
        Arrays.fill(array, null);

    }

    int size() {
        return array.length;
    }

    Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        return array[index];

    }


    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(new Object[3], 2);

        //myArrayList.add();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Fore");


        System.out.println("Розмір списку: " + list.size());
        System.out.println("Елемент за індексом 4: " + list.get(4));

        list.remove(2);
        System.out.println("Розмір списку: " + list.size);

        list.clear();
        System.out.println("Розмір списку після очищення: " + list.size());
    }

}

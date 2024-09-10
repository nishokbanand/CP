import java.util.Arrays;

public class CustomLinkedList<T> {
    private Object[] list;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomLinkedList() {
        this.list = new Object[DEFAULT_SIZE];
    }

    void add(T num) {
        if (isFull()) {
            resize();
        }
        list[size++] = num;
    }

    boolean isFull() {
        return list.length == size;
    }

    void resize() {
        Object[] temp = new Object[size * 2];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    T remove() {
        T removed = (T) (list[size--]);
        return removed;
    }

    int getsize() {
        return size;
    }

    void setitem(int index, T item) {
        this.list[index] = item;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list) + " " + size;
    }

}

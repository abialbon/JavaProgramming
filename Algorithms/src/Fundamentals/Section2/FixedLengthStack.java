import java.util.Iterator;

public class FixedLengthStack<Item> implements Iterable<Item> {
    private int size = 0;
    private int capacity;
    private Item[] items;

    FixedLengthStack (int c) {
        capacity = c;
        items = (Item[]) new Object[c];
    }

    public void push(Item i) {
        if (size != capacity) {
            items[size++] = i;
        }
    }

    public void pop() {
        if (size != 0) {
            items[--size] = null;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Item> iterator() {
        return new _FixedStackIterator();
    }

    private class _FixedStackIterator implements Iterator<Item> {
        private int index = 0;
        public boolean hasNext() {
            return index < size;
        }
        public Item next() {
            return items[index++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Working!");
        FixedLengthStack<Integer> fs = new FixedLengthStack<Integer>(3);
        fs.push(13);
        fs.push(20);
        fs.push(50);
        fs.pop();
        fs.push(49);
        for(int i: fs) {
            System.out.println(i);
        }
        System.out.println(fs.size());
    }
}

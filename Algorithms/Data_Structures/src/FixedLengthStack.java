public class FixedLengthStack<Item> {
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
            Item temp = items[--size];
            items[size] = null;
            items[size - 1] = temp;
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println("Working!");
        FixedLengthStack<Integer> fs = new FixedLengthStack<Integer>(3);
        fs.push(13);
        fs.push(20);
        fs.pop();
        System.out.println(fs.size());
    }
}

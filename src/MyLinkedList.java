import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size;

    public void add(T value) {
        Node<T> node = new Node<>();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        setSize(getSize() + 1);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T value = currentNode.value;
                currentNode = currentNode.next;
                return value;
            }
        };
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    private static class Node<T> {
        T value;
        Node<T> next;
    }

    public MyLinkedList() {

    }

    public void reverse() {
        Node<T> processingNode = head, toBeTailNode = head;
        Node<T> currentHeadNode = null;
        Node<T> toBeProcessedNode;
        while (processingNode != null) {
            toBeProcessedNode = processingNode.next;
            processingNode.next = currentHeadNode;
            currentHeadNode = processingNode;
            processingNode = toBeProcessedNode;
        }
        head = currentHeadNode;
        tail = toBeTailNode;
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Green");
        list.add("looser");
        list.add("cherry");
        list.add("screen");
        list.add("battery");
        for (String token : list) {
            System.out.println(token);
        }
        list.reverse();
        for (String token : list) {
            System.out.println(token);
        }
        list.reverse();
        for (String token : list) {
            System.out.println(token);
        }
    }

}

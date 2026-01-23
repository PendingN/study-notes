import java.util.NoSuchElementException;
public interface ListInterface<E> {
    public void addFirst(E item);
    public void addLast(E item);
    public void addAfter(Node<E> current,E item);
    public E removeFirst() throws NoSuchElementException;
    public E removeLast() throws NoSuchElementException;
    public E removeAfter(Node<E> current) throws NoSuchElementException;
    public void Print();
    public boolean isEmpty();
    public int Size();
    public E getFirst() throws NoSuchElementException;
    public Node<E> getHead() throws NoSuchElementException;
    public boolean contains(E item);
}
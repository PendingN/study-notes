import java.util.NoSuchElementException;
public class MyStack<E> implements Stackinterface<E>{
    private Node<E> top;
    private int NumNode;

    public MyStack(){
        top = null;
        NumNode = 0;
    }

    public void push(E item){
        top = new Node<E> (item,top);
        NumNode++;
    }
    public E pop() throws NoSuchElementException{
        if(top == null){
            throw new NoSuchElementException("Loi");
        }
        else{
            E data = top.getData();
            top = top.getNext();
            NumNode--;
            return data;
        }
    }
    public int size(){
        return NumNode;
    }
    public boolean contains(E item) throws NoSuchElementException{
        if(top == null) throw new NoSuchElementException("LOI");
        else{
            Node<E> tmp = top;
            while(tmp!= null){
                if(tmp.getData().equals(item)) return true;
            }
            return false;
        }
    }
    public void print(){
        Node<E> tmp = top;
            while(tmp.getNext()!= null){
                System.out.print("|"+tmp.getData()+"|~");
                tmp = tmp.getNext();
            }
            System.out.println("|"+tmp.getData()+"|");

    }
    public boolean isEmpty(){
        if(NumNode == 0) return true;
        return false;
    }
    public E getPeek() throws NoSuchElementException{
        if(isEmpty()) throw new NoSuchElementException("loi");
        return top.getData();
    }
}
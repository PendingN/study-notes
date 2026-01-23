import java.util.NoSuchElementException;
class MyLinkedList<E> implements ListInterface<E>{
    private Node<E> head;
    private int NumNode;

    public MyLinkedList(){
        this.head = null;
        this.NumNode = 0;
    }
    @Override
    public void addFirst(E item){
        head = new Node<E>(item,head);
        NumNode++;
    }
    public void addLast(E item){
        if(head == null){
            addFirst(item);
        }
        else{
            Node<E> tmp = head;
            while(tmp.getNext()!= null){
                tmp = tmp.getNext();
            }
            Node<E> n = new Node<E>(item);
            tmp.setNext(n);
            NumNode++;
        }
    }
    public void addAfter(Node<E> current,E item){
        if(current == null){
            addFirst(item);
        }
        else{
            Node<E> n = new Node<E>(item,current.getNext());
            current.setNext(n);
            NumNode++;
            }
        }
    public E removeFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Loi");
        }
        else{
            Node<E> tmp = head;
            head = head.getNext(); 
            NumNode--;
            return tmp.getData();
        }
        
    }
    public E removeLast() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Loi");
        }
        else{
            Node<E> delNode = head;
            Node<E> preNode = null;
            while(delNode.getNext() != null){
                preNode = delNode;
                delNode = delNode.getNext();
                preNode.setNext(null);
                NumNode--;
            }
            return delNode.getData();
              
        }
    }
    public E removeAfter(Node<E> current) throws NoSuchElementException{
        if(current == null){
            throw new NoSuchElementException("Loi");
        }
        else{
            Node<E> delNode = current.getNext();
            if(delNode == null){
                throw new NoSuchElementException("Loi");
            }
            else{
                current.setNext(delNode.getNext());
                NumNode--;
                return delNode.getData();
            }
        }
    }
    public void Print(){
        if(head == null){
            System.out.println("Danh sach rong");
        }
        else{
            Node<E> tmp = head;
            System.out.print("List:["+ tmp.getData());
            while(tmp.getNext()!= null){
                tmp = tmp.getNext();
                System.out.print(","+tmp.getData() );

            }
            System.out.println("]");
        }
    }
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }
    public int Size(){
        return NumNode;
    }
    public E getFirst() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Loi");
        }
        else return head.getData();
    }
    public Node<E> getHead() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Loi");
        }
        else return head.getNext();  
    }
    public boolean contains(E item){
        if(head == null){
            return false;
        }
        else{
            Node<E> tmp = head;
            while(tmp!= null){
                if(tmp.getData().equals(item)) return true;
                tmp = tmp.getNext();
            }
            return false;
        }
    }
    public E removeCur(Node <E> cur) throws NoSuchElementException{
        if(head == null || cur == null){
            throw new NoSuchElementException(" LOI ");
        }
        if(cur ==head){
            removeFirst();
        }
        Node<E> pre = head;
        while (pre.getNext()!= null && pre.getNext()!= cur){
            pre = pre.getNext();
        }
        if(pre.getNext()== null) throw new NoSuchElementException(" ");
        pre.setNext(cur.getNext());
        cur.setNext(null);
        NumNode--;
        return cur.getData();
    }
    
    public int countEven(MyLinkedList<Integer> list){
        int cnt=0;
        Node<E> tmp = head;
        while(tmp != null){
            if((int)tmp.getData()%2 == 0){
                cnt++;
            }
            tmp = tmp.getNext();
        }
        return cnt;
    }
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public int countPrime(MyLinkedList<Integer> list) {
        int cnt = 0;
        Node<E> tmp = head;
        while (tmp != null) {
                int num = (int) tmp.getData();
                if (isPrime(num)) {
                    cnt++;
                }
            
            tmp = tmp.getNext();
        }
        return cnt;
    }
    public void addFirstEven(E item,MyLinkedList<Integer> list){
        Node<E> tmp = head.getNext();
        Node<E> preTmp = head;
        if(head==null) return;
        if((int)head.getData()%2 ==0){
            addFirst(item);
            return;
        }
        while(tmp != null ){
            if((int)tmp.getNext().getData()%2 == 0){
                addAfter(preTmp.getNext(),item);
                break;
            }
            preTmp = tmp;
            tmp = tmp.getNext();
        }
        
        if(tmp == null) return;
    }
    public int MaxNum(MyLinkedList<Integer> list){
        Node<E> tmp = head;
        int max = (Integer) tmp.getData();
        while(tmp != null){
                Integer n = (Integer) tmp.getData();
                if(n>max){
                    max = n;
                }
            tmp = tmp.getNext();
        }
        return max;
    }

    public void reverse(MyLinkedList<Integer> list){
        if(head == null || NumNode==1){
            return;
        }
        Node<E> before = null;
        Node<E> tmp = head;
        Node<E> eco_tmp = null;
        while(tmp!= null){
            eco_tmp = tmp.getNext();
            tmp.setNext(before);
            before =tmp;
            tmp = eco_tmp;
        }
        head = before;
    }

    public void ascending(){
        
    }

}
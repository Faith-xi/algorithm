package dataStructure.linklist;

public interface LinkedList<T> {

    public Node get(int p);

    public void Insert(int p, T data);

    public void delete(int p);

    public int size();

    public void headInsert(T headNode);

    public void print();
}

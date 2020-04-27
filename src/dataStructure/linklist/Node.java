package dataStructure.linklist;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：Node
 * Create date： 2020/4/20 09:54
 * Description：TODO
 * Update history：
 * ================================================
 */
public class Node<T> {

    public T data;
    public Node next;

    public Node(){

    }

    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
}

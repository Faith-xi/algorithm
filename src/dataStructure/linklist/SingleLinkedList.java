package dataStructure.linklist;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：SingleLinkedList
 * Create date： 2020/4/19 17:26
 * Description：TODO 单向链表实现类
 * Update history：
 * ================================================
 */
public class SingleLinkedList<T> implements LinkedList<T> {

    private Node head;// 头节点
    private int length;// 链表长度

    public SingleLinkedList(){
        head = null;
        length = 0;
    }


    @Override
    public Node get(int p) {
        Node current = head;
        if (p > 0 && p < length){
            for (int i = 0; i < p-1; i++) {
                current = current.next;
            }
            return current;
        }
        return null;
    }

    @Override
    public void Insert(int p, T data) {
        Node current = head;
        Node node = new Node();
        node.data = data;
        if (p > 0 && p <= length+1){
            for (int i = 0; i < p-2; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            length++;
        }
    }

    @Override
    public void delete(int p) {
        Node current = head;
        if (p > 0 && p <= length) {
            if (p == 1) {
                head = current.next;
                length--;
                return;
            } else {
                for (int i = 1; i <= p; i++) {

                    if (i == p - 1) {
                        current.next = current.next.next;
                        length--;
                    } else {
                        current = current.next;
                    }
                }
            }
        }
    }

    @Override
    public int size() {
        return this.length;
    }


    @Override
    public void headInsert(T headNodeData) {
        Node<T> node = new Node<>();
        node.data = headNodeData;
        node.next = head;
        head = node;
        length++;
    }


    @Override
    public void print() {
        Node current = head;
        for (int i = 0; i < length; i++) {
            if (i == length-1)
                System.out.print(current.data);
            else
                System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println();
    }


}

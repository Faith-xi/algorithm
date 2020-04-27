import dataStructure.binarytree.BinaryTree;
import dataStructure.binarytree.TreeNode;
import dataStructure.linklist.Node;
import dataStructure.linklist.SingleLinkedList;
import leetCode.LeetCode206;

import static util.PrintUtil.printLinkedListByHeadNode;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：Test
 * Create date： 2020/4/19 17:50
 * Description：TODO
 * Update history：
 * ================================================
 */
public class Test {

    public static void main(String[] args){

//        SingleLinkedList<Integer> linklist = new SingleLinkedList<Integer>();
//        linklist.headInsert(4);
//        linklist.headInsert(3);
//        linklist.headInsert(2);
//        linklist.headInsert(1);
//        linklist.print();
//        Node head = reverseList(linklist.get(1));
//        printLinkedListByHeadNode(head);

        BinaryTree bt = new BinaryTree(new TreeNode(0,"A"));
        bt.creatBinaryTree();

        System.out.print(bt.getRoot().data);
        System.out.print(bt.getRoot().leftChild.data);
        System.out.print(bt.getRoot().rightChild.data);
        System.out.print(bt.getRoot().leftChild.leftChild.data);
//        System.out.print(bt.getRoot().leftChild.rightChild.data);
//        System.out.print();
//        System.out.print();

    }

    public static Node reverseList(Node head){
        Node current = head;
        Node beforeCurrent = null;
        while(current != null){
            Node behindCurrent = current.next;
            current.next = beforeCurrent;
            beforeCurrent = current;
            current = behindCurrent;
        }
        return beforeCurrent;
    }
}

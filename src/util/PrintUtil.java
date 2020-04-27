package util;

import dataStructure.linklist.Node;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：PrintUtil
 * Create date： 2020/4/19 13:26
 * Description：TODO
 * Update history：
 * ================================================
 */
public class PrintUtil {

//    public static void printSample();

    /**
     * 打印整形数组
     * @param Arrays
     */
    public static void printArray(int[] Arrays){
        for (int i = 0; i <Arrays.length ; i++) {
            if (i==Arrays.length-1)
                System.out.print(Arrays[i]);
            else
                System.out.print(Arrays[i]+"->");
        }
    }


    /**
     * 传入头结点打印链表
     * @param head
     */
    public static void printLinkedListByHeadNode(Node head){
        Node current = head;
        while(current != null){
            if(current.next != null){
                System.out.print(current.data+"->");
            }else{
                System.out.print(current.data);
            }
            current = current.next;
        }
    }

}

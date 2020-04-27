package leetCode;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：LeetCode141
 * Create date： 2020/4/21 23:03
 * Description：TODO
 * Update history：
 * ================================================
 */

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LeetCode141 {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }


    public boolean hasCycle(ListNode head) {
        ListNode testNode = new ListNode(-100);
        testNode.next = head;
        ListNode slowNode = testNode;
        ListNode fastNode = testNode;
        while(true){
            if (fastNode.next == null || fastNode.next.next == null){
                return false;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(fastNode == slowNode){
                return true;
            }
        }
    }

}

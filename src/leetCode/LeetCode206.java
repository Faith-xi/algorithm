package leetCode;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：LeetCode206
 * Create date： 2020/4/20 10:25
 * Description：TODO
 * Update history：
 * ================================================
 */

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode206 {


    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    /**
     * 将每个节点的指针指向自己的前驱节点。所以需要记录两个节点；
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode beforeCurrent = null;
        while(current != null){
            ListNode behindCurrent = current.next;
            current.next = beforeCurrent;
            beforeCurrent = current;
            current = behindCurrent;
        }
        return beforeCurrent;
    }
}

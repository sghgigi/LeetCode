/* Reverse a singly linked list.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
			return head;
		ListNode p = head;
		ListNode front = head.next;
		head.next = null;
		while (front != null) {
			ListNode temp = front.next;
			front.next = p;
			p = front;
			front = temp;
		}
		return p;
        
        
    }
}


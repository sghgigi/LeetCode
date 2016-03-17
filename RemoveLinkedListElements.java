/* Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode newhead = pre;
        while(pre != null && pre.next != null){
            ListNode p = pre.next;
            while(p!=null && p.val == val){
                p=p.next;
            }
                pre.next = p;
                pre = pre.next;
            }
        return newhead.next;  
        }
        
}
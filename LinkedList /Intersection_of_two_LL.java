/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode f =headA;
        ListNode s =headB;
        if(headA==null && headB==null)
        {
            return null;
        }
        while(f!=s)
        {
           if(f==null)
           {
            f=headB;
           }
           else{
            f=f.next;
           }
           if(s==null)
           {
            s=headA;
           }
           else{
            s=s.next;
           }
        }
        return f;

    }
}

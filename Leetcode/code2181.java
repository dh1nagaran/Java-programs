/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode l1=head;
        ListNode l2=new ListNode();
        ListNode res=l2;
        int count=0;
        int val=0;
        while(l1!=null)
        {
            val+=l1.val;
            if(l1.val==0 && val>0)
            {
                ListNode c = new ListNode(val);
                if (l2 == null) {
                    l2 = c;
                } else {
                    l2.next = c;
                    l2 = c;
                }
                val=0;
            }
            l1=l1.next;
        }
        return res.next;

        
    }
}
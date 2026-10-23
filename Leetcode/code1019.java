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
    public int[] nextLargerNodes(ListNode head) {
        ListNode head1=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(head1!=null)
        {
            ListNode head2=head1;
            int max=checkGreater(head1.val,head1);
            al.add(max);
            head1=head1.next;
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
        
    }
    int checkGreater(int val,ListNode heads)
    {
        while(heads!=null)
        {
            if(val<heads.val)return heads.val;
            heads=heads.next;
        }
        return 0;
    }
}

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode trav = head;
        int count = 0;

        while (trav != null) {
            count++;
            trav = trav.next;
        }

        int start = k;
        int last = count - k + 1;

        ListNode swap1 = null;
        ListNode swap2 = null;
        trav = head;
        count = 0;
        while (trav != null) {
            count++;
            if (count == start) {
                swap1 = trav;
            }
            if (count == last) {
                swap2 = trav;
            }
            trav = trav.next;
        }

        ListNode head1 = null;
        ListNode tail1 = null;

        trav = head;
        count = 0;

        while (trav != null) {

            ListNode temp=new ListNode(trav.val);
            count++;
            if (count == k) {
                temp =new ListNode(swap2.val);
            } 
            else if (count == last) {
                temp = new ListNode(swap1.val);
            } 
            if (head1 == null) {
                head1 = temp;
                tail1 = temp;
            } else {
                tail1.next = temp;
                tail1 = temp;
            }
            trav=trav.next;
        }

        return head1;
    }
}

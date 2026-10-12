
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode head1 = null, tail1 = null;
        ListNode head2 = null, tail2 = null;

        ListNode curr = head;
        int i = 0;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = null;
            if (i % 2 == 0) {
                if (head1 == null) {
                    head1 = tail1 = curr;
                } else {
                    tail1.next = curr;
                    tail1 = curr;
                }
            } else {
                if (head2 == null) {
                    head2 = tail2 = curr;
                } else {
                    tail2.next = curr;
                    tail2 = curr;
                }
            }

            i++;
            curr = nextNode;
        }

        tail1.next = head2;
        return head1;
    }
}

class MyCircularQueue {
    Node head;
    int size=0;
    int len=0;
    class Node {
        Node next;
        int val;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyCircularQueue(int k) {
        size=k;
    }
    
    public boolean enQueue(int value) {
        Node newNode=new Node(value);
        if(len==size)return false;
        if(head==null){
            head=newNode;
            len++;
            return true;
        }
        Node head1=head;
        while(head1.next!=null){
            head1=head1.next;
        }
        head1.next=newNode;
        len++;
        return true;
    }
    
    public boolean deQueue() {
        if(head==null) return false;
        head=head.next;
        len--;
        return true; 
    }
    
    public int Front() {
        if(head==null){
            return -1;
        }
        return head.val;
        
    }
    
    public int Rear() {
        if(head==null){
            return -1;
        }
        Node head1=head;
        while(head1.next!=null){
            head1=head1.next;
        }
        return head1.val;
    }
    
    public boolean isEmpty() {
        if(head==null)return true;
        return false;
        
    }
    
    public boolean isFull() {
        if(len==size)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

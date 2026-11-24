class MyCircularDeque {
    Node head;
    int len=0;
    int size=0;
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public MyCircularDeque(int k) {
        size=k;
        
    }
    
    public boolean insertFront(int value) {
        if(len==size)return false;
        Node newNode=new Node(value);
        Node nextNode=head;
        head=newNode;
        head.next=nextNode;
        len++;
        return true;  
    }
    
    public boolean insertLast(int value) {
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
    
    public boolean deleteFront() {
        if(head==null)return false;
        Node head1=head;
        head=head.next;
        len--;
        return true;
        
    }
    
    public boolean deleteLast() {
        if(head==null)return false;
        Node head1=head;
         if (head.next == null) {
        head = null;
        len--;
        return true;
    }

        while(head1.next.next!=null){
            head1=head1.next;
        }
        head1.next=null;
        len--;
        return true; 
    }
    
    public int getFront() {
        if(head==null)return -1;
        return head.val;
        
    }
    
    public int getRear() {
        if(head==null)return -1;
        Node head1=head;
        while(head1.next!=null){
            head1=head1.next;
        }
        return head1.val;  
    }
    
    public boolean isEmpty() {
        if(len==0)return true;
        return false;
    }
    
    public boolean isFull() {
        if(len==size)return true;
     return false;   
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

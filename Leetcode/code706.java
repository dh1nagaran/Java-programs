class MyHashMap {
        Node head;
    class Node{
        int val;
        int key;
        Node next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
        }
    }
    Node arr[]=new Node[10];

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        int org=key%10;
        Node heads=arr[org];
        if(heads==null){
            arr[org]=new Node(key,value);
            return;
        }
        if(heads.key==key){
            heads.val=value;
            return;
        }
            while(heads.next!=null)
            {
                if(heads.next.key==key){
                    Node nex=new Node(key,value);
                    nex.next=heads.next.next;
                    heads.next=nex;
                    return;
                }
                heads=heads.next;
            }
            heads.next=new Node(key,value);
    }
    
    public int get(int key) {
        int org=key%10;
        Node heads=arr[org];
        if(heads==null)return -1;
        while(heads!=null)
        {
            if(heads.key==key)return heads.val;
            heads=heads.next;
        }
        return -1;   
    }
    
    public void remove(int key) {
        int org=key%10;
        Node heads=arr[org];
        if(heads==null)return;
        if(heads.key==key)
        {
            arr[org]=heads.next;
            return;
        }
        while(heads.next!=null)
        {
            if(heads.next.key==key){
                heads.next=heads.next.next;
                return;
            }
            heads=heads.next;
        } 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
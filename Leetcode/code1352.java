class ProductOfNumbers {
    int arr[]=new int[100000];
    int index=0;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
       arr[index++]=num;
    }
    
    public int getProduct(int k) {
        int num=1;
        for(int i=index-1;i>=index-k;i--){
            num*=arr[i];
        }
        return num;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
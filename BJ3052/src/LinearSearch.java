public class LinearSearch {
    int[] arr;
    int x;
    LinearSearch(int[] arr,int n, int x){
        this.arr = new int[n];
        this.arr=arr;
        this.x=x;
    }

    public boolean search(){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==x)
                return true;
        }
        return false;
    }
}

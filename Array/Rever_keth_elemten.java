public class Rever_keth_elemten {
    public   static  void revers(int []n ,int start,int end){
        while (start<end) {
            int tem=n[start];
            n[start]=n[end];
            n[end]=tem;
            start++;
            end--;  
        }
       
    }
    public  static void rotate(int []n,int left,int right){
        revers(n, 0, n.length-1);
        revers(n, left, right);
      
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int k=3;  
       rotate(arr, 2, 5);
       for (int i : arr) {
        System.out.print(i+" ");
        
       }


    }
    
}

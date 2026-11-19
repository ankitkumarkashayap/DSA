public class LeftRotate_Array {

        public  static void leftRotate(int []n,int k){
            k=k%n.length;
             swap(n,  0,k-1 );
                    swap(n, k, n.length-1);
                        swap(n, 0, n.length-1);

        }

        public static void swap(int []n,int start,int end){
            while (start<=end) {
                int tem=n[start];
                    n[start]=n[end];
                        n[end]=tem;
                            start++;
                                end--;
                
            }
        }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
            leftRotate(arr, 2);
                for (int i : arr) {
                    System.out.print(i+" ");
                    
                }
    }
    
}

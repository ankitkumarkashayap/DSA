package ne.new_Array_qustion;

public class SumExcept_it_self_Q6 {
    public static int [] sumExcept_it_self(int []n){
        int sum=0;
        int []res=new int[n.length];
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
         for(int i=0;i<n.length;i++){
            res[i]=sum-n[i];
        }
    return res;

    }
    public static void main(String[] args) {
        int []arr={2, 5, 4, 3, 6};
        arr= sumExcept_it_self(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        
    }
    
}

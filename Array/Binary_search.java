import java.io.Serial;

public class Binary_search {

@Serial 
    public static int  Binary_search(int [] n,int target){
        int low=0,high=n.length-1;
        while (low<=high) {
            int mid =low+(high-low)/2;
            if (n[mid]==target) {
             return  mid;
                
            }
            else if (n[mid]>target) {
                high=mid-1;
                
            }else {
                low=mid+1;
            }
            
        }
        return  -1;

    }
    public static void main(String[] args) {
        int [] arra={12,13,14,15,16,17};
        int result=Binary_search(arra, 15);
        System.out.println(result);
    }
    
}

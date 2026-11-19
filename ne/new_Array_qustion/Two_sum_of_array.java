

package ne.new_Array_qustion;
public class Two_sum_of_array {
    public  static  int [] check(int []n,int targat){
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if (n[i]+n[j]==targat) {
                    return new int []{i,j};
                    
                }
            }

        }
           return new int[]{-1,-1};
        
    }
    public static void main(String[] args) {
        int []arr={10,5,3,2,2,10};
          int targat=20;
            int []result=check(arr, targat);
               for (int i : result) {
                  System.out.print("index is :"+i+" ");
        
                }
    }
    
    
}


public class FindKthElement {
    public  static void check(int []n, int target){
        boolean Condition=true;
        int mid=n.length/2;
        if (n[mid]>=target) {
            for(int i=0;i<=mid;i++){
                if (n[i]==target) {
                    Condition=false;
                 System.out.println(i+" index  "+n[i]);     
                }
            }   
        } else{
            for(int i=mid;i<n.length;i++){
                
                if (n[i]==target) {
                 Condition=false;
                    System.out.println(i+"index :"+n[i]);      
                }
            }
        
        }
        if (Condition) {
            System.out.println("Not peresnt in aaray this target :"+target);
        }
            }
    public static void main(String[] args) {
        int []arr={1,2,3,4,8,9,7,8};
        check(arr, 8);
        
    }

    
}
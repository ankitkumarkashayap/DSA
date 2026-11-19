package ne.new_Array_qustion;

public class Check_element_incressing_and_decressing {
    public static boolean check(int []n){
        for(int i=1;i<n.length;i++){
            if (n[i]<n[i-1]) {
                return  false;
                
            }
        }
        return true;
    }
public static void main(String[] args) {
    int []arr={2,3,4,5,6,7};
   boolean res= check(arr);
   if (res) {
    System.out.println("this is array incressing ");
    
   }else{
    System.out.println("this is not increasing array");
   }
}
    
}

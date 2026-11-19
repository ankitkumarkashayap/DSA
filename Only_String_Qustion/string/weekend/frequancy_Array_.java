package Only_String_Qustion.string.weekend;
import java.util.HashMap;
import  java.util.Map;
public class frequancy_Array_ {
    public  static void chaek_frequency(int []n){
        Map<Integer,Integer>freq=new HashMap<>();
        for (int i : n) {
           int valu= freq.getOrDefault(i, 0);
           freq.put(i, valu+1);
            
        }
        System.out.println(freq);
        
    }
    public static void main(String[] args) {
        int [] arr={2,2,2,4};
        chaek_frequency(arr);
        
    }
    
}

package ne.new_Array_qustion;

public class Q3_ {
    
    public static void print(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=n; j++){
               
               if (i==1||i==4 ||j<2||j==5) {
                    System.out.print("* ");
                
            
                }else{
                    System.out.print(" ");
                }
              
               
            }   
                 System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
        
    }
    
}

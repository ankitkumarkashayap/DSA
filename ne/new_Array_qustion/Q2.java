package ne.new_Array_qustion;

public class Q2 {
    
    public static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (i%2==0) {
                    System.out.print("1");
                    
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
        
    }
    
}

    


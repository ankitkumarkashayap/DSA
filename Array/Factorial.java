
public class Factorial {
    public static int  factorial(int n){
        
        int res=0;
        if (n==0) {
            return 1;    
        }
        res= n*factorial((n-1));
        return res;
    }
    public static void main(String[] args) {
       System.out.println( factorial(5));
       
        
    }
    
}

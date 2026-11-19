

public class Pawer {
    public static int  getSum(int n){
        if (n==1) {
            return 1;   
        }
        return n+getSum(n-1);
    }
    public static void main(String[] args) {
        
    }
    
}

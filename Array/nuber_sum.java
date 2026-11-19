

public class nuber_sum {
    public static int  getSum(int n){
        if (n==1) {
            return 1;   
        }

        return n+getSum(n-1);
    }
    public static void main(String[] args) {
      int re=  getSum(5);
       System.out.println(re);
        
    }
    
}

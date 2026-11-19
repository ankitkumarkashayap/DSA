public class armstrong {
    public  static  void  chak(int n){
        int temp=n;
        int sum=0;
        while (n>0) {
            int rem=n%10;
            sum+=rem*rem*rem;
            n=n/10;
            
        }
        if (sum==temp) {
            System.out.println("this armstrong number");
            
        }else{
            System.out.println("this is not armstrong number");
        }
    }
    public static void main(String[] args) {
        int a= 153;
        chak(a);

    }
    
}

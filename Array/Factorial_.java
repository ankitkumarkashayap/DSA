public class Factorial_ {
    public  static  void  Factorial(int a){
        int fact=1 ;
        for(int i=1;i<a;i++){
    
            fact+=fact*i;
          
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int a=5;
        Factorial(a);
    }
    
}

public class fibna {
    public static  void fib(){
       
        int index1=0;
        int index2=1;
        System.out.print(index1+" "+index2+" ");
        for(int i=0;i<10;i++){
            int index3=index1+index2;
            System.out.print(index3+" ");
            index1=index2;
            index2=index3;
        }
    }
    public static void main(String[] args) {
        fib();
    }
    
}

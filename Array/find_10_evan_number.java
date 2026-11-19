public class find_10_evan_number {
    public  static  void find_10_eva(){
        int count=0;
        for(int i=1;;i++){
            if (i%2==0) {
                System.out.print(i+" ");
                count++;
                if (count==10) {
                    break;
                    
                }
                
            }
        }
    }
    public static void main(String[] args) {
        find_10_eva();
        
    }
    
}

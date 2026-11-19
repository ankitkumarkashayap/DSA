public class sunlight_wala_qustion {
    public static int sunlight(int []n){
        if (n.length==0) {
            System.out.println("array is emty");
            return 0;
        }
        int max=n[0],count=1;
        for (int i : n) {
            if (i>max) {
              max=i;
              count++;  
            }
            
        }
        return count;   
    }
    
    public static void main(String[] args) {
        int []arr={10,15,5,20,25,20,30,35};
      int res=  sunlight(arr);
      System.out.print("only going to sunlight  "+res);
    }
}

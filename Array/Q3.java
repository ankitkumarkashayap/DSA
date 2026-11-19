public class Q3 {
  
    
    public static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
               
              if (j%2==0) {
                 System.out.print(1+" ");
                
              }else{
                System.out.print("0 ");
              }
              
               
            }   
                 System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
        
    }
    
}

    


    


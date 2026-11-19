public class Print_Frequancy_ {

    //check karne liye 
    public static void chaek_frequance(int []a){
        int []res= new int[10];
        for(int i: a){
            res[i]++;
        }
        for(int i=0;i<res.length;i++){
            if (res[i]>0) {
                System.out.println(i+" is : "+res[i]+" times");
                                    
            }
        }
    }

    
    public static void main(String[] args) {
        int []arr={1,1,2,3,2,3,2};
        chaek_frequance(arr);
       
    }
    
}

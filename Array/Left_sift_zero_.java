public class Left_sift_zero_ {
    public static int [] left_sift_zero_(int []n){
        int index1=0;
        int count=0;
        int []res=new int[n.length];
        for (int i : n) {
            if (i==0) {
             count++;
            }     
        }
        for(int i=0;i<count;i++){
            res[index1++]=0;
        }

          for(int i=0;i<n.length;i++){
                if(n[i]!=0)

           res[index1++]=n[i];
        }
         return res;
    }

     public static int [] rigtt_sift_zero_(int []n){
        
        int index1=0;
        int count=0;
        int []res=new int[n.length];
        for (int i : n) {
            if (i==0) {
                count++;
            }     
        }
      
          for(int i=0;i<n.length;i++){
                if(n[i]!=0)

           res[index1++]=n[i];
        }

         for(int i=0;i<count;i++){
            res[index1++]=0;
        }
         return res;
    }

    public static void main(String[] args) {
        int []n={0,2,3,0,4,0,3,7,0};
        n=rigtt_sift_zero_(n);
        left_sift_zero_(n);
        for(int res :n)System.out.print(res+" ");
    }
 
    
}

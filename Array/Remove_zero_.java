

public class Remove_zero_ {
  
    public static int [] remove_zero_(int [] a){
        int index=0;
        int count=0;

        for (int i : a) {
            if (i!=0) {
                count++;
            }  
        }
        int []res =new int[count];
        for (int i=0;i<a.length;i++){
            
            if (a[i]!=0) {
                    res[index++]=a[i];      
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={2,3,0,5,0,9,0,5};
       arr= remove_zero_(arr);
       for (int i : arr) {
        System.out.print(i+" ");
        
       }    
    }
    
}

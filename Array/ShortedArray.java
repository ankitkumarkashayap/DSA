

public class ShortedArray {
    public static int [] shorArray(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]<a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                }

            }
        }
        return a;

    }
    public static void main(String[] args) {
        int []arr={12,23,4,45,5,6,67};
       
       int []res= shorArray(arr);
       
       for (int n : res) {
        System.out.print(n+" ");
        
       }
        
    }
    
}

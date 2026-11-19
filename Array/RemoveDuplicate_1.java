import java.lang.reflect.Array;

class RemoveDuplicate_1{

    public static int [] removeDuplicate(int arr[]){
        int n=arr.length;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if (arr[i]==arr[j]) {
                arr[j]=arr[n-1];
                j--;
                n--;

                
            }
        }
       
      }
      int [] res=new  int[n];
      for(int i=0;i<n;i++){
        res[i]=arr[i];
      }
      return  res;
    }
    public static void main(String[] args){
        int arr[]={1,2,2,3,4};
       arr= removeDuplicate(arr);
      for (int i : arr) {
        System.out.print(i+" ");
        
      }
    }
}
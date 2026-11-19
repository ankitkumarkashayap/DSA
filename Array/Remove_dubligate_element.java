

public class Remove_dubligate_element {
    public static int[] removeDuplicates(int[] a) {
        int n = a.length ;//5-1=4-1=3-1
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if (a[i]==a[j]) {
                a[j]=a[n-1];
                j--;
                n--;
     
            }
        }
       }
       int []res=new int[n];
       for(int i=0; i<n;i++){
        res[i]=a[i];
       }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};

       arr= removeDuplicates(arr);
       for (int i : arr) {
        System.out.print(i+" ");
       }
    }

}

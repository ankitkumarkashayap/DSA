 

public class Keth_Remove_Element_ {

    public static int[] Keth_remove_Element_(int[] a, int k) {
        int keth = k;
        for (int i = 0; i < a.length - 1; i++) {
            
            if (i < keth) {
                a[i] = a[i];

            } else {
                a[i] = a[i + 1];
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        arr = Keth_remove_Element_(arr, k);
       for (int i=0;i<arr.length-1;i++) {
        System.out.print(arr[i]+" ");
       }

    }

}

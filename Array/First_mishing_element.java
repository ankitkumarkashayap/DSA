

public class First_mishing_element {
   public static int first_mishing_element(int[] a) {
        int size = a.length ;
        for (int i = 0; i < size; i++) {
            
            if (a[i] > 0 && a[i] <= size && a[i] != a[a[i] - 1]) {
                int temp = a[i];
                a[i] = a[a[i] - 1];
                a[temp - 1] = temp;
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != i + 1) {
                return i + 1;
        }
        }
        return size + 1;
    }
    public static void main(String[] args) {
     int []a={2,3,4,5,6};
        int res = first_mishing_element(a);
        System.out.print(res);
    }

}

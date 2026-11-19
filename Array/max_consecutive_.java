

public class max_consecutive_ {
    public static int max_consecutive(int[] a) {
        int count = 0;
        int max = 0;
        for (int i : a) {
            if (i == 1) {
                count++;}    

             }
        if (count>max) {
            max=count;
           
            
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 1, 1, 1, 1};
        int res = max_consecutive(arr);
        System.out.println(res + "\tmax_consecutive");

    }

}

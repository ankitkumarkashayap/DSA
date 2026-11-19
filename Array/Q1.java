

public class Q1 {

    public static int[] revers(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;

            start++;
            end--;
        }

        return a;
    }

    public static int[] rotate(int[] a) {

        // Step 1: Reverse complete array
        revers(a, 0, a.length - 1);

        // Step 2: Reverse first 2 elements
        revers(a, 0, 1);

        // Step 3: Reverse remaining elements
        revers(a, 2, a.length - 1);

        return a;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        arr = rotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

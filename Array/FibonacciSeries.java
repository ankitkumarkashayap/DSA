public class FibonacciSeries {

    public static void check(int n) {
        int index1 = 0;
        int index2 = 1;

        System.out.print(index1+ " " + index2+ " ");

        for (int i = 1; i < n; i++) {
            int index3 = index1 + index2;
            System.out.print(index3 + " ");

            index1 = index2;
            index2 = index3;
        }
    }

    public static void main(String[] args) {
        int n=10;
        check(n);
    }
}

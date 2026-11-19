public class prime {

    public static boolean check(int n) {

        if (n < 2) {//this condition base con..
            return false;
        }

        for (int i = 2; i < n; i++) {
            System.out.println(i);
            if (n% i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int a = 10;
        boolean b = check(a);

        if (b) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not prime number");
        }
    }
}

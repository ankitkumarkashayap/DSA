 

public class ChaekPalkindromeArray {

    public static boolean ChaekPalkindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 12, 13, 13, 12, 11 };
        boolean res = ChaekPalkindrome(arr);
        if (res) {
            System.out.println("Array is a plindrome  ");

        } else {
            System.out.println("Array is a not palindrome ");
        }

    }

}

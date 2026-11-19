package Only_String_Qustion.string;

public class Remove_Space_Or_Number {
    public static boolean RemoveSpaceOrNumber(String s) {
        s = s.toLowerCase();
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ' && !(c >= '0' && c <= '9')) {
                temp += c;

            }
        }
        System.out.println(temp);
        return ChekPalindrome(temp);

    }

    public static boolean ChekPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;

            }
            start++;

            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a b 1 b a";
       if (RemoveSpaceOrNumber(s)) {
        System.out.println(s+"\t is palindrome ");
        
       } 
       else{
        System.out.println(s+"\tnot palindrome");
       }

    }

}

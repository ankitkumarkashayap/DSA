package Only_String_Qustion.string;

public class Palindrome {
    public static boolean CheakPalindrome(String s){
        s.toLowerCase();
    int start =0;
    int end =s.length()-1;

        while (start<end) {
            if (s.charAt(start)!=s.charAt(end)) {
               
                return false;     
            }
            start++;
                end--;
        
                
                
        }
    return true;
    }

    public static void main(String[] args) {
        String s = "aabba";
        if (CheakPalindrome(s)) {
            System.out.println(s+"\tis palindrome string ");
            
        }
        else{
            System.out.println(s+"\tis not palindrome string ");
        }

    }

}

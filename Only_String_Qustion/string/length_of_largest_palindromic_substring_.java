package Only_String_Qustion.string;

public class length_of_largest_palindromic_substring_ {
    public static boolean isPalindromicChak(String s){
        int start=0;
        int end=0;
        if (s.length()%2==1) {
            start=s.length()/2;
            end=start;  
        }
        else{
            start=s.length()/2-1;
            end =start+1;
        }
        while (start>=0&&end>s.length()) {
            if (s.charAt(start)!=s.charAt(end)) {
                return false;     
            }
            start--;
            end++;
            
        }
        return  true;
    }
    public static void main(String[] args) {
        String s="asmadamcc";
       boolean res= isPalindromicChak(s);
        if (res) {
        System.out.println(s+": this is palindromic String ");            
        }
        else{
            System.out.println(res+": this is not palindromic String ");
        }
        
    }
    
}

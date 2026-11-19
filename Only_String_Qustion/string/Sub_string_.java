package Only_String_Qustion.string;

public class Sub_string_ {
    public static boolean is_Sub_Stirng_Chaek(String s1, String s2) {
          int j = 0;
        if (s2.length() > s1.length()) {
            return false;
        }
        for (int i = 0; i < s1.length() - s2.length(); i++) {
          
            while (j < s1.length() && s1.charAt(i + j) == s2.charAt(j)) {
                
            j++;   
            }
            if (j==s2.length()) {
                return true;
                
            }
         
        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "acbcde";
        String s2 = "cde";
      boolean res=  is_Sub_Stirng_Chaek(s1, s2);
      if (res) {
        System.out.println("s2 is substring of s1");
        
      }
      else{
        System.out.println( "s2 is not substring ");
      }

    }

}


package Only_String_Qustion.string;

public class Stack_String {
    public  static  String  uniqSubString(String s){
        int start=0;
        int end=0;
        String temp="";
        while (end<s.length()) {
            if (temp.indexOf(s.charAt(end)) == -1) {
                temp+=s.charAt(end);    
            }
            else{
                temp="";
                 start++;
            }
            end++;
            
        }
      return   s.substring(start+1,end);
          
    }
    public static void main(String[] args) {
        String s="abbebcc";
      s=  uniqSubString(s);
      System.out.println(s);
    }
    
}

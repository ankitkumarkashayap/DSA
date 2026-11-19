package Only_String_Qustion.string.new-final-mock;

public class Revers_string_ {
    public  static  String revers(String s){
        String res="";
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            res=c+res;
        }
        return res;
    }
    public static void main(String[] args) {
        String s ="cba";
        revers(s);
        
    }
    
}


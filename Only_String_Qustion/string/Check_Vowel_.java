package Only_String_Qustion.string;

public class Check_Vowel_ {
    public static boolean check(String s){
        int count=0;
        String c1="lllll";
        for(int i=0;i<c1.length();i++){
            char c=c1.charAt(i);
         for(int j=0;j<s.length();j++){
            char c2=s.charAt(i);
            if (c==c2) {
                count++;
                
            }
            if (count==c1.length()) {
                return  true;
                
            }

         }
        }
        return  false;
    }
    public static void main(String[] args) {
        String s="abcdiou";
        boolean res=check(s);
        if (res) {
            System.out.println("this is done");
        }
        else{
            System.out.println("this is not inside string vowel");
        }
    }

    
}

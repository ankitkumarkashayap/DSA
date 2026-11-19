  package Only_String_Qustion.string;

public class Remove_two_dubliget_Adjeting_Character {
    public  static String removeDubliget(String s){
        StringBuilder b= new StringBuilder(s);
        int i=1;
        while (b.length()>i) {
            
        
        if (i>0&& b.charAt(i-1)==b.charAt(i)) {
            b.delete(i-1, i+1);
            i=-2;
            
        }
        i++;
    }
        return b.toString();
    }
    public static void main(String[] args) {
        String s="aabbac";
      s=removeDubliget(s);
         System.out.println(s);
        
    }

    
}
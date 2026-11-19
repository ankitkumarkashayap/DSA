package Only_String_Qustion.string;

public class mishing_number {
    public static  int  chak_mishing_number(String s){
        
        for(int i=1; i<=s.length();i++){   
           boolean found=false;
           for(int j=0;j<s.length();j++){
            int res= s.charAt(j)-'0';
            if (i==res) {
            found =true;
            break;

                
            }
           }
           if (!found) {
            return  i;
            
            
           }
        }
        return  s.length()+1;

    }
    public static void main(String[] args) {
       String s = "12346";

       int result= chak_mishing_number(s);
       System.out.println(result);
    }
    
}

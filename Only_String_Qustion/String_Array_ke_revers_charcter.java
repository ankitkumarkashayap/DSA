package Only_String_Qustion;

public class String_Array_ke_revers_charcter {
    public static String [] nikalna_(String []s){
        String res="";
        String finalResult="";
        for(int i=0;i<s.length;i++){
            res=s[i];
           for(int j=0;j<res.length();j++){
            char c=res.charAt(j);
            finalResult=c+finalResult;


           }
           s[i]=finalResult;
           res="";
           finalResult="";
        }
        return s;
    }

    public static void main(String[] args) {
        String []s={"Ankit","tanu","shikha"};
        s=nikalna_(s);
        for (String string : s) {
            System.out.print(string+" ");
            
        }
    }
}

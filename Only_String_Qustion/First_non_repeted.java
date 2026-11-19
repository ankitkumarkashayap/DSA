package Only_String_Qustion;



public class First_non_repeted {
    public static char getFirstnon(String s){
        int []res=new int[26];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
        }
        for(int i=0;i<res.length;i++){
                if (res[i]!=0) {
                    System.out.println((char)(i+'a')+" "+ res[i]);
                    
                }
            
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s="bacc";
      char c=  getFirstnon(s);
      System.out.println(c);
    }
    
}

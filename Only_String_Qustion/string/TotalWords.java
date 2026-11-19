package Only_String_Qustion.string;



public class TotalWords {
    public static void main(String[] args) {
        String s="They are together running for a healthy lifen ";
        System.out.println(s);
        System.out.println("Total word is: "+getWordCount(s));
    }
    public static int getWordCount(String s){
        String temp="";
        int count=0;
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            if(c!=' ')
                temp=temp+c;
            if((c==' ' || i==s.length()-1) && temp.length()>0){
              
                count++;
                temp="";
            }
        }
    return count;
    }  
}
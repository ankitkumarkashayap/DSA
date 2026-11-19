package Only_String_Qustion.string;

public class ReversString {
    public static String [] Revers_String(String []s){
        int start=0;
        int end=s.length-1;
    while (start<end) {
        String temp=s[end];
        s[end]=s[start];
        s[start]=temp;
        start++;
        end--;
    }
    return s;
    }
    public static void main(String[] args) {
        String []s={"Ankit ","Kumar","rajput"};
        String []res= Revers_String(s);
        for (String string : res) {
            System.out.print(string+" ");
            
        }
    }
    
}

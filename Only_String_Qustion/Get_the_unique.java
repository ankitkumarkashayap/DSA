package Only_String_Qustion;

public class Get_the_unique {
    public static String getSubString(String s){
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
          int odd=  get(s, i, i);
          int evan=  get(s, i, i+1);
          int temp=Math.max(odd, evan);
          if (temp>max) {
            max=temp;
          left=i-(max-1)/2;
          right=i+max/2+1;
          
          }
        }
       
        return s.substring(left, right);  
    }
        public static int  get(String s, int start,int end){ 
        while (start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)) {
            
                start--;
                end++;      
        }
        return end-start-1;
        }
    public static void main(String[] args) {
        String s="abcabbac";
        String res=getSubString(s);
        System.out.println(res);
    }
    
}

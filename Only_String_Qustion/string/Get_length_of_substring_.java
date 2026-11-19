package Only_String_Qustion.string;


public class Get_length_of_substring_ {
    public  static String  get_length_of_substring_(String s){
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
          int odd=  expend(s, i, i);
          int evan=  expend(s,i, i+1);
          int temp=Math.max(odd, evan);
          if (temp>max) {
            max=temp;
           left=i-(max-1)/2;
            right=i+max/2;
          }
        }
        return  s.substring(left,right+1);
        

    }

    public  static  int expend(String s,int start ,int end ){
        while (start>=0&& end<s.length()&&s.charAt(start)==s.charAt(end)) {
            start--;
            end++;
            
        }
        return  end-start-1;
    }

    public static void main(String[] args) {
        String s="absmadam";
       String  res= get_length_of_substring_(s);
        System.out.println(res);
    }

    
}
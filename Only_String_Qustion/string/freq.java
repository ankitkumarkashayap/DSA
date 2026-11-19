package Only_String_Qustion.string;

public class freq {
    public  static  void  chaek_frequance(String s){
         String ress=" ";
        int []freq =new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        freq[c-'a']++;
        }
        

        for(int i=0;i<freq.length;i++){
            if (freq[i]>0) {
                // ress+=(char)(i+97)+""+freq[i];
               // System.out.println((char)(i+97)+" is time "+freq[i]);
               System.out.print((char)(i+97));
                
            }
        }
       // System.out.println(ress);
    }
     public  static  void  compresd(String s){
        String res="";
        int []freq =new int[26];
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
        freq[c-'a']++;
        }


        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (freq[c-97]>0) {
                res =res+c+freq[c-97];
                freq[c-97]=0;
                
                
            }
        }
        System.out.println(res);
    }
      public  static  String   maxfreq(String s){
        String res="";
        char b=' ';
        int []freq =new int[26];
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
        freq[c-'a']++;
        }

int maxfreq=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (freq[i]>maxfreq) {
               
             maxfreq=freq[i];
            b= c=(char)(i+97);
                
                
            }
           // return     b+" "+maxfreq;
        }
     return     b+" "+maxfreq;
    }

    public static String  dubliget(String s){
        String res ="";
        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-97]++;

        }
        for(int i=0;i<freq.length;i++){
            if (freq[i]>0) 
                
            res+=(char)(i+97);
        }
       return  res;
    }


     public  static String  compresd1(String s){
         int count=1;
         String res="";
        for(int i=0;i<s.length()-1;i++){
           // int count=1;
           char c=s.charAt(i);
            if (c==s.charAt(i+1)) {
                count++;
                
            }else{
                res=res+c+count;
                count=1;
            }
        }
         res=res+s.charAt(s.length()-1)+count;
        // res = res + s.charAt(s.length() - 1) + count;

        return  res;
    }





    public static  String dub(String s){
        String tem="";
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if (tem.indexOf(c)==-1) {
        tem+=c;
        
    }
}

return tem;
    }
  
    public static void main(String[] args) {
        String s="ababccccc";
      // chaek_frequance(s);
       ///compresd(s);
     String q=  compresd1(s);
     //String c=  maxfreq(s);
     System.out.println(q);
    // System.out.println(c);
  //  s=dubliget(s);
   // System.out.println(s);
   // String b=compresd1(s);
    //System.out.println(b);
   // s=dub(s);
    //System.out.println(s);
    }
    

    
}

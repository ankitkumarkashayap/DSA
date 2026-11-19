public class remove_space{

   public static String remove(String s){
     String res=" ";
    
   for(int i=0;i<=s.length()-1;i++){
       char c=s.charAt(i);
       if(c!=' '){
       res+=c;
       }
    }
      return res;
}
     public static void main(String [] args){

     String s="Ankit kumar";
   s= remove( s);
   System.out.println(s);
}
}
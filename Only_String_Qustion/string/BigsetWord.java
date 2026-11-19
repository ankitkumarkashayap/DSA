    package Only_String_Qustion.string;

    public class BigsetWord {
      public static String getBiggestWord(String s) {
            String temp = "", biggest = "";
         for(int i=0;i<s.length();i++){
        
                char c=s.charAt(i);
             if (c!=' ') 
                temp+=c;
                
            if (c==' '|| i==s.length()-1){
   
                  if (temp.length()>biggest.length()) {
                   biggest=  temp;
            
                }
               
                temp=" ";
            }

        }
            return biggest;
    }

        public static void main(String[] args) {
            String s = "They are together running for a healthy lifeAnkitkuymar";
           
            System.out.println("Biggest word is: " + getBiggestWord(s));
        }

    }
    

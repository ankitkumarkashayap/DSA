public class Abhidelet {
    public  static  String two_String_ka_sum(String n1,String n2){
        int i=n1.length()-1;
        int j=n2.length()-1;
        int sum=0;
        int cary=0;
        String result="";
        while (cary !=0|| i>=0||0<=j) {
            sum=cary;
            if (i>=0) {
                sum+=(n1.charAt(i)-'0');
                i--;      
            }
         if (j>=0) {
                sum+=(n2.charAt(j)-'0');
                j--;     
            }
            result=sum % 10 +result;
            cary=sum/10;
            sum=0;
            
        }
        return   result;

    }


    public static void main(String[] args) {
        String num1="1234";
        String num2="23456";
        String  res=two_String_ka_sum(num1, num2);
        System.out.println(res);
    }
    
}

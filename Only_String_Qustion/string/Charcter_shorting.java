package Only_String_Qustion.string;

public class Charcter_shorting {
    public static char[] charcter_shorting(char [] c){
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if (c[i]>c[j]) {
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;   
                }
            }
        }
        return c;

    }
    public static void main(String[] args) {
        char[] c = { 'a', 'z', 'f', 'e', 'd', 'c', 'b' };
        char[] res = charcter_shorting(c);
        for (char d : res) {
            System.out.print(d+" ");
            
        }


    }

}



public class String_And_Array_Shorting_ {

    public static void String_And_Array_ko_nikalna(String s) {
        String res = "";
        int sum = 0;
        int k = 0;
        int[] n = new int[100];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                res += c;
            } else {
                sum = (s.charAt(i) - '0');
                n[k++] = sum;
            }
        }
        Array_Shorting(n);
        String_short(res);
    }

    public static void String_short(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void Array_Shorting(int[] n) {

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[j];
                    n[j] = n[i];
                    n[i] = temp;

                }
            }

        }
        for (int i : n) {
            if (i > 0) {

                System.out.print(i + " ");
            }
        }
    }






    // public  static String  compresd(String s){
    //      int count=1;
    //      String res="";
    //     for(int i=0;i<s.length()-1;i++){
    //        // int count=1;
    //        char c=s.charAt(i);
    //         if (c==s.charAt(i+1)) {
    //             count++;
                
    //         }else{
    //             res=res+c+count;
    //             count=1;
    //         }
    //     }
    //     return  res+s.charAt(s.length()-1)+count;
    // }

    public static void main(String[] args) {
        String s = "zyxw6585vutsrq943587ponmlkjihg768fedcba321";
        String_And_Array_ko_nikalna(s);

    }

}
package Only_String_Qustion.string;

public class SortCharacters {
    
    public static String sortCharacters(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        String res = "";
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                res = res + (char) (i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abced";

        System.out.println("Sorted String is: " + sortCharacters(s));
    }

    
}

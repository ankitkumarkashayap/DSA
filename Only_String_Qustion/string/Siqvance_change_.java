package Only_String_Qustion.string;

public class Siqvance_change_ {
    public static String change_Siqvance(String s) {
        String result = "";
        String result1 = "";
        for (int i = 0; i < s.length(); i++) {// i evol uoy
            char c = s.charAt(i);
            result = c + result;

            if (result.length() >=0) {
                result1 += result;
                result = "";

            }

        }

        return result1;

    }

    public static void main(String[] args) {
        String s = " i love you";
        s = change_Siqvance(s);
        System.out.println(s);
    }

}

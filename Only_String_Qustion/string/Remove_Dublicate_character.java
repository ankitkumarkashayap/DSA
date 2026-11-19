package Only_String_Qustion.string;

public class Remove_Dublicate_character {
    public static void remove(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (temp.indexOf(c) == -1) {
                temp += c;
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        String s = "aaaabbbbzzzcc";

        remove(s);
    }

}

package Only_String_Qustion.string;
public class Two_String_ka_sum {
    public static String two_String_ka_sum(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        String result = "";
        int cray = 0;
        while (i >= 0 || j >= 0) {
            sum = cray;
            if (i >= 0) {
                sum += (num1.charAt(i) - '0');
                i--;

            }
            if (j >= 0) {
                sum += (num2.charAt(j) - '0');
                j--;

            }
            result = sum % 10 + result;
            cray = sum / 10;
            sum = 0;

        }
        return result;

    }

    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "23456";
        String res = two_String_ka_sum(num1, num2);
        System.out.println(res);

    }

}

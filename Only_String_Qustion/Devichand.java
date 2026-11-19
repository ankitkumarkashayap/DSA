package Only_String_Qustion;

public class Devichand {
    public static void main(String[] args) {

        String s1="pppppppp";

        System.out.println(removeDuplicate(s1));
        
    }

    public static int[] getFrequency(String s1)
    {
        int[] freq=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            freq[c-97]++;
        }
        return  freq;
    }

    public static String removeDuplicate(String s1)
    {
            String res="";

            int[] freq=getFrequency(s1);

            for(int i=0;i<freq.length;i++)
            {

                if(freq[i]>0)
                    {

                        res=res+(char)(i+97);

                    }
            }

            return  res;
    }
    
}

package Only_String_Qustion.string;

public class remove_dubligete_String {
  public static void removedubligete(String[] s) {
    
    String[] res = new String[s.length];
    int index = 0;
    for (int i = 0; i < s.length; i++) {
      boolean dubligate = false;
      for (int j = i + 1; j < s.length; j++) {

        if (s[i].equals(s[j])) {
          dubligate = true;
        }
      }
      if (!dubligate) {
     
        res[index++] = s[i];
        
      }
    }
    for(int i=0; i<index;i++){
      System.out.print(res[i]+" ");
    }

  }

  public static void main(String[] args) {

    String[] p = { "Ankit", "kumar", "kumar" };
    removedubligete(p);

  }

}

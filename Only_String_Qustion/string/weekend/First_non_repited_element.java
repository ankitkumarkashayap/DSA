package Only_String_Qustion.string.weekend;

public class First_non_repited_element {
    public  static int chaek(int []n){
int []freq=new int[12];
for (int i : n) {
    freq[i]++;
    
}

for(int i=0;i<freq.length-1;i++){
    if (freq[i]==1) {
        return i;
        
    }
}
return -1;
    }
    public static void main(String[] args) {
        int [] arr={8,11,2,3,3,3,8};
     int n=   chaek(arr);
     System.out.println(n);
    }
    
}
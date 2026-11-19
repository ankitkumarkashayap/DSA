

public class chaek_first_mishing {
    public static int  chaek(int []n){
        for(int i=0;i<n.length;i++){
         while (n[i]>0&& n[i]<=n.length&& n[i]!=n[n[i]-1]) {
            int temp =n[i];//3
            n[i]=n[n[i]-1];
            n[temp-1]=temp;
            
        }
    }
        for(int j=0;j<n.length;j++){
            if (n[j]!=j+1) {
                return j+1;
                
                
            }
        }
        return n.length+1;
    }
    public static void main(String[] args) {
        int []n={1,3,4,0,2};
       int  res=chaek(n);
       System.out.println(res);
    }
    
}

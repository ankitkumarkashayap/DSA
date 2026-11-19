package Sorting;

public class selection {

public  static  int [] Sorting(int []n){
    int minelement=0;
    int minindex=0;
    for(int i=0;i<n.length;i++){
        minelement=n[i];
        minindex=i;
        for(int j=i+1;j<n.length;j++){
            if (n[i]>n[j]) {
                minelement=n[j];//8
                minindex=j;//1         
            }
         int temp=n[i];
            n[i]=minelement;//8
            n[minindex]=temp;
        }
    }


    return  n;
}



    public static void main(String[] args) {
    int []arra={9,8,7,6,5,4,3,2,1};
    arra=Sorting(arra);
    for (int i : arra) {
        System.out.print(i+" ");
        
    }


    }
    
}

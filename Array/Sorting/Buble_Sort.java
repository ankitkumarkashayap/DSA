package Sorting;

public class Buble_Sort {
    public  static  int [] Sorting(int [] n){
        for(int i=0 ; i<n.length;i++){
            for(int j=1+i;j<n.length;j++){
                if (n[i]>n[j]) {
                    int temp =n[j];
                    n[j]=n[i];
                    n[i]=temp;

                }

            }
        }
        return  n;
    }
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,5,4,3,2};
        arr=Sorting(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    
}

package Sorting;
//quikshort is a maniczam
//in quik sort elemnt is plased right position and then we ferthor sort all the left side elemnt and then right side element
public    class quikShor {


public  static   int  getPivotIndex(int [] n ,int start,int end){
    int pivot=n[start];
    swap(n, start, end);
    int i=start-1;
     for(int  j=start; j<end;j++){
        if (n[j]<=pivot) {
            i++;
            swap(n, i, j);    
        }
     }
     swap(n, i+1, end);
     return i+1;
}
public  static void  swap(int []a,int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
public  static  void  Quksost(int []n,int start,int end){
    if (start<end) {
        int pivot=getPivotIndex(n, start, end);
        Quksost(n, start, pivot-1);
        Quksost(n, pivot+1, end);
    }

}
    public static void main(String[] args) {
        int []arr={18,12,10,40,50,70};
        Quksost(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        
    }
    
}

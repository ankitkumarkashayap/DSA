package Sorting;

public class merg_sort {
public static void divid(int []n,int start,int end){
    
    if (start<end) {
        int mid=start+(end-start)/2;
        divid(n, start, mid);
        divid(n, mid+1, end);
       merg(n, start, mid, end);
        
    }
    
}
public  static  void  merg(int[]n,int start,int mid ,int end){
    int index1=start,index2=mid+1;
    int index3=0;
    int []mergd=new int[end-start+1];
    while (index1<=mid&&index2<=end) {
        if (n[index1]<=n[index2]) {
            mergd[index3++]=n[index1++];

            
        }else{
             mergd[index3++]=n[index2++];
        }   
    }

    while (index1<=mid) {
          mergd[index3++]=n[index1++];
        
    }
    while (index2<=end) {
          mergd[index3++]=n[index2++];
        
    }
  
        
    for(int i=start, j=0; j<mergd.length; i++, j++){
            n[i]=mergd[j];
        }


}
    public static void main(String[] args) {
     int []a={4,2,1,5,3};
        divid(a, 0, a.length-1);
        for (int i : a) {
            System.out.print(i+" ");
            
        }
    }
}

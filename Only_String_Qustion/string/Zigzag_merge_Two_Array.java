package Only_String_Qustion.string;

public class Zigzag_merge_Two_Array {

 public static int [] merg(int []a,int []b){
    int index1=0;
    int index2=0;
    int index3=0;
    int []res =new int[a.length+b.length];
    while (a.length>index1 && b.length >index2) {
        
        res[index3++]=a[index1++];
        res[index3++]=b[index2++];
 
    }
    while (a.length>index1) {
        res[index3++]=a[index1++];

        
    }
    while (b.length>index2) {
        res[index3++]=b[index2++];
        
        
    }


return res;
 }
public static void main(String[] args) {
    int []a={1,2,3,4};//1,2,3,4,5,6,7,8,9
     int []b={5,6,7,8,9};
   int [] res= merg(a, b);
   for (int i : res) {
    System.out.print(i+" ");
    
   }

    
}
    
}

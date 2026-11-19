

import  java.util.Scanner;
public class Isert_element_in_Array {
    public  static int [] insret_valu(int []n,int valu,int index){
        if (index>0&&index>n.length) {
            System.out.print("not found index");
            return  n;
            
        }
        int []b=new int[n.length+1];
        b[index]=valu;
        for(int i=0;i<n.length+1;i++){
            if (i<index) {
                b[i]=n[i];
                
            }
            else if(i>index){
                b[i]=n[i-1];
            }

        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int []arr={10,30,40};
        System.out.println("enter index");
        int index=sc.nextInt();
        System.out.println();
        int valu=sc.nextInt();  
      arr=  insret_valu(arr, valu, index);
      for (int i : arr) {
        System.out.print(i+" ");
        
      }

        


    }
    
}

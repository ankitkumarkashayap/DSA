package ne.new_Array_qustion;

public class Swap_two_element {
    public static int [] sawp(int []n,int start,int end){
        int temp=n[start];
        n[start]=n[end];
        n[end]=temp;

        return  n;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70};
      arr=  sawp(arr, 1, arr.length-2);
      for (int i : arr) {
        System.out.print(i+" ");
        
      }

    }
    
}

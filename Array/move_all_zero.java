import java.util.*;
public class move_all_zero {
    public static void main(String[] args) {
    
    int[] arr = {1,0,8,0,4};
    int[] temp = new int[5];
    int j =0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0)
        arr[j++] = arr[i];
      }
      while(j<arr.length)
      {
        arr[j++]=0;
      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  }

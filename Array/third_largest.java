// third largest element 
import java.util.*;
public class third_largest {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] arr = {1,2,3,4,9,8};
      int first = arr[0];
      int second = Integer.MIN_VALUE;
      int third = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>first){
          third = second;
          second = first;
          first = arr[i];
        }
        else if(arr[i]>second){
          third = second;
          second = arr[i];
        }
        else if(arr[i]>third){
          third = arr[i];
        }
      }
      System.out.print("The third largest element: "+third);
  }
}
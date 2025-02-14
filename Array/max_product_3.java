//Maximum product of a triplet (subsequence of size 3) in array

import java.util.*;
import java.lang.Math;
public class max_product_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] arr = {1,2,3,4,9,8};
      int max_product = Integer.MIN_VALUE;
      int n = arr.length;
      for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
          for(int k=j+1;k<n;k++){
            max_product=Math.max(max_product,arr[i]*arr[j]*arr[k]);
          }
        }
      }
      System.out.print("The Maximum product of a triplet "+max_product);
     }
}


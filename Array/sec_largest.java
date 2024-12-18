import java.util.*;
class sec_largest{
  public int getSecondLargest(int[] arr) {
     Arrays.sort(arr);
     int sec_max=-1;
      for (int i = arr.length - 2; i >= 0; i--) {
          if (arr[i] != arr[arr.length - 1]) {  
              sec_max = arr[i];
              break;
          }
      }
    return sec_max;
  }
}
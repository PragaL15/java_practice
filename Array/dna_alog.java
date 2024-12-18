import java.util.*;
public class dna_alog { 
  public void sort012(int[] arr) {
      int low = 0, mid = 0, high = arr.length - 1;

      while (mid <= high) {
          switch (arr[mid]) {
              case 0:
                  swap(arr, low, mid);
                  low++;
                  mid++;
                  break;
              case 1:
                  mid++;
                  break;
              case 2:
                  swap(arr, mid, high);
                  high--;
                  break;
          }
      }
  }

  public void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  public static void main(String[] args) {
    dna_alog solution = new dna_alog();
      int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
      solution.sort012(arr);

      for (int num : arr) {
          System.out.print(num + " ");
      }
  }
}

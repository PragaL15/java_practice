1. Selection sort method 

```java
import java.util.*;
public class selection_sort{
  public static void selection(String[] args){
     int[] arr1 = {1,3,2,7,5};
     int n = arr1.length;
     for(int i=0;i<n-1;i++){
      int min =i;
      for(int j=i+1;j<n;j++){
          if(arr1[j]<arr1[min]){
          min=j;
          }
      }
      int swa = arr1[i];
      arr1[i] = arr1[min];
      arr1[min] = swa;
     }
     for(int i=0;i<n;i++){
      System.out.println(arr1[i]);
     }
  }
}
```
 **Time complexity** --> `O(n^2)`
 **Space complexity** --> `O(n)`

1. In this sorting we will find the minimum value and replace them with the `i` value and it starts with the first index.
2. Initialise the `minIndex` value to store the index of the min value.
3. Compare each element with the element at `minIndex`. If a smaller element is found, update `minIndex`.
4. And swap the current index `i` with the new index with `minIndex`.
5. Repeat this until array gets sorted.

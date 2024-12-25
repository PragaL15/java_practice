1. This prints the ascending order of array.

```java
{
  int[] arr1= {30,10,4,56,98,1};
  int n= arr1.length;
  for(int i=n-1;i>=0;i--){
    for(int j=0;j<=i-1;j++){
      if(arr[j+1] < arr[j]){
        int temp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
      }
  }
}
}
```
---
2. Descending order of array

```java
{
  int[] arr1= {30,10,4,56,98,1};
  int n= arr1.length;
  for(int i=n-1;i>=0;i--){
    for(int j=0;j<=i-1;j++){
      if(arr[j+1] > arr[j]){
        int temp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
      }
  }
}
}
```

1. The outer loop ensures that each pass sorts one element into its correct position at the end of the unsorted portion.
2. The inner loop performs comparisons and swaps only within the unsorted portion of the array.
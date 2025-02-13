### Arrays

1. Declaration of arrays - `int[] arr_num = new int[5];`

- It could have same datatype inputs and mentioning the size is `must`.

2. To get input from user in the 2D array

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
     int[][] arr = new int[row][row];

     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr[i][j]=input.nextInt();
       }
     }
     System.out.print(Arrays.deepToString(arr));
  }
}
```

---

3. To check if two matric are equal or not.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int[][] arr1 = new int[row][row];
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr1[i][j]=input.nextInt();
       }
     }
      int[][] arr2 = new int[row][row];
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr2[i][j]=input.nextInt();
       }
     }
     int equal =0;
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         if(arr1[i][j] != arr2[i][j])
         equal = 1;
       }
     }
     if(equal ==1)
     System.out.print("false");
     else
     System.out.print("true");
  }
}
```
4. Add two 2D matrix and print it's sum.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int[][] arr1 = new int[row][row]; 
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr1[i][j]=input.nextInt();
       }
     }
      int[][] arr2 = new int[row][row]; 
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr2[i][j]=input.nextInt();
       }
     }
     int[][] sum =new int[row][row];
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         sum[i][j] = arr1[i][j] + arr2[i][j];
       }
     }
System.out.print(Arrays.deepToString(sum));
  }
}
```
---
5. To print the transpose of the given matrix.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int[][] arr1 = new int[row][row]; 
      for(int i=0;i<row;i++){
        for(int j=0;j<row;j++){
          arr1[i][j]=input.nextInt();
       }
     }
      for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         System.out.print(arr1[j][i]+" ");
       }
         System.out.println();
     }
  }
}
```
6. 
#### Patterns 

1. Example:
Input:  ‘N’ = 3
Output: 
* 
* *
* * *

```java
public class Solution {
    public static void nForest(int n) {
     for(int i=0;i<n;i++){
         for(int j=0;j<=i;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
}
```
---
2. Sam is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3

```java
public class Solution {
    public static void nTriangle(int n) {
         for(int i=0;i<n;i++){
             for(int j =1;j<=i+1;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
         }
        }
    }
```
---
3. am is making a Triangular painting for a maths project.

An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.

For every value of ‘N’, help sam to print the corresponding Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
2 2 
3 3 3

```java
public class Solution {
    public static void nTriangle(int n) {
                for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
```
---
4. Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output: 
```
 * * *
 * *
  *
  ```

```java
public class Solution {
    public static void seeding(int n) {
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
---
5. Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output: 

1 2 3
1 2
1

```java
public class Solution {
    public static void nNumberTriangle(int n) {
     for(int i=0;i<n;i++){
         for(int j=1;j<=n-i;j++){
             System.out.print(j+" ");
         }
         System.out.println();
     }
    }
}
```
6. Input: ‘N’ = 3

Output: 
```
  *
 ***
*****
```

```java 
public class Solution {
    public static void nStarTriangle(int n) {
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
           for(int j=0;j<(i*2)+1;j++){
               System.out.print("*");
           }
           for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
             System.out.println();
       }
     
    }
}
```
---
7.
Input: ‘N’ = 3

Output: 
```
 *****
  ***
   *
```

```java
public class Solution {
    public static void nStarTriangle(int n) {
              for (int i = 0; i < n; i++) {
              for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
               for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
               System.out.println();
        }
    }
}
```
---
8. 



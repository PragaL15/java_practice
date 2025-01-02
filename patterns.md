#### Patterns 

1. Example:
Input:  ‘N’ = 3
Output: 
```
* 
* *
* * *
```

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
```
1
1 2 
1 2 3
```

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
```
1
2 2 
3 3 3
```

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
```
1 2 3
1 2
1
```

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
8. Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 
```
*
**
***
**
*
```

```java 
public class Solution {
    public static void nStarTriangle(int n) {
for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int k= n-1;k>0;k--){
    for(int j=0;j<k;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
```
---
9. Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.

You are required to print the pattern as shown in the examples below.

Example:
Input: ‘N’ = 3

Output: 
```
1
0 1
1 0 1
```
```java
public class Solution {
public static void nBinaryTriangle(int n) {
    for (int i = 1; i <= n; i++) { 
        int start = (i % 2 == 0) ? 0 : 1; 
        for (int j = 0; j < i; j++) { 
            System.out.print(start + " "); 
            start = 1 - start; 
        }
        System.out.println(); 
        }
}
}
```
---
10. Ninja has been given a task to print the required star pattern and he asked your help for the same.

You must return an ‘N’*’N’ matrix corresponding to the given star pattern.

Example:
Input: ‘N’ = 4

Output: 
```
****
*  *
*  *
****
```

```java
public class Solution {
    public static void getStarPattern(int n) {
       for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                    if(i==0 || i==(n-1) || j==0 || j==(n-1)){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
```

---
11. Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output: 
```
1         1
1 2     2 1
1 2 3 3 2 1
```

```java 
public class Solution {
    public static void numberCrown(int n) {
       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
        for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }}
```
---
12. Floyd's triangle
Input: ‘N’ = 3

Output: 
```
1
2 3
4 5 6
```
```java
public class Solution {
    public static void nNumberTriangle(int n) {
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
```

---
13. Input: ‘N’ = 3

Output: 
```
A
A B
A B C
```

```java
public class Solution {
    public static void nLetterTriangle(int n) {
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+j) +" ");
            }
            System.out.println();
        }
    }
}
```
---
14. Input: ‘N’ = 3

Output: 
```
A B C
A B
A
```

```java
public class Solution {
    public static void nLetterTriangle(int n) {
       char chh='A';
       for(int i=n;i>0;i--){
for(int j=0;j<i;j++){
    System.out.print((char)(chh+j)+" ");
}
System.out.println();
       }
    }
}
```
---
15. Input: ‘N’ = 3

Output:
``` 
A
B B
C C C
```

```java
public class Solution {
    public static void alphaRamp(int n) {
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+i)+" ");
            }
            System.out.println();
        }
    }
}
```
16. Mirrored right angle triangle

```
     *
    **
   ***
  ****
 *****
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for(int i=1;i<=row;i++){
          for(int j=0;j<=row-i;j++){
              System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
              System.out.print("*");
            }
        System.out.println();
}
    }
}
```
17. Hollow right angle triangle

```
      *
     **
    * *
   *  *
  *   *
 ******
 ```
 ```java
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for(int i=1;i<=row;i++){
          for(int j=0;j<=row-i;j++){
              System.out.print(" ");
          }
            for(int k =1;k<=i;k++){
              if(i==row || k==i ||k==1 )
              System.out.print("*");
              else 
              System.out.print(" ");
            }
      
        System.out.println();
}
    }
}
```
---
18. Normal hallow rigth angle triangle
```
*
**
* *
*  *
*   *
******
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for(int i=0;i<=row;i++){
            for(int k =1;k<=i;k++){
              if(i==row || k==i ||k==1 )
              System.out.print("*");
              else 
              System.out.print(" ");
            }
        System.out.println();
}
    }
}
```
---
19. Hollow pyramid triangle
```
      *      
     * *     
    *   *    
   *     *   
  *       *  
 *         * 
*************
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<=n;i++){
          for(int j=0;j<=n-i-1;j++){
            System.out.print(" ");
          }
            for(int k =1;k<=2*i+1;k++){
              if(k==1 || k==2*i+1 || i==n)
              System.out.print("*");
              else 
              System.out.print(" ");
            }
             for(int j=0;j<=n-i-1;j++){
            System.out.print(" ");
          }
        System.out.println();
}
    }
}
```
---
20. Left arrow star pattern
```
***
**
*
*
**
***
```
```java 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
---
21. X-cross pattern
```
*   *
 * * 
  *  
 * * 
*   *
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
```
---
22. 
### Basic Loops in java 

1. Print all the natural numbers in from 0 to n.

```java 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n;
      Scanner inp = new Scanner(System.in);
      n = inp.nextInt();
      for(int i=0;i<n;i++){
        System.out.println(i+" ");
      }
  }
}
```
---
2. Print the natural number from 0 to n in reverse order.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n;
      Scanner inp = new Scanner(System.in);
      n = inp.nextInt();
      for(int i=n;i>=0;i--){
        System.out.println(i+" ");
      }
  }
}
```
---
3. Write a java program to print all alphabets from a to z and using A to Z – using while loop.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      char lower = 'a';
      while(lower <= 'z'){
        System.out.print(lower +" ");
        lower++;
      }
      System.out.println();
      char upper = 'A';
      while(upper <= 'Z'){
        System.out.print(upper +" ");
        upper++;
      }
  }
}
```
---
4. Print all the even numbers from 0 to expected range.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    for(int i=0;i<n;i++){
      if(i%2==0)
      System.out.print(i+" ");
    }
  }
}
```
---
5. Print all the odd numbers from 0 to expected number.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    for(int i=0;i<n;i++){
      if(i%2!=0)
      System.out.print(i+" ");
    }
  }
}
```
---
6. Print the sum of natural numbers from 0 to n.

```java 
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    int sum =0;
    for(int i=0;i<=n;i++){
      sum+=i;
    }
    System.out.print(sum);
  }
}
```
---
7. Print the sum of all even numbers between 1 to n.

```java 
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    int sum =0;
    for(int i=0;i<=n;i++){
      if(i%2==0)
      sum+=i;
    }
    System.out.print(sum);
  }
}
```
---
8. Print a multiplication table of any number.

```java 
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    int multiply =1;
    for(int i=1;i<=n;i++){
      multiply=i*n;
      System.out.print(multiply+" ");
    }
  }
}
```
---
9. Print the count the number of digits in a number.

```java 
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n= inp.nextInt();
    int count =0;
    while(n!=0){
      int rem = n%10;
      count++;
      n/=10;
    }
    System.out.print(count);
  }
}
```
---
10. Print the first and last digit of a number and their sum.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int last = n%10;
      while(n>=10){
        n/=10;
      }
      int sum = last+n;
      System.out.println(n);
      System.out.println(last);
      System.out.println(sum);
  }
}
```
---
11. Print the sum of digits of a given number.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int sum = 0;
      while(n!=0){
        int rem = n%10;
        sum+=rem;
        n/=10;
      }
      System.out.println(sum);
  }
}
```
---
12. Print a number and print its reverse.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int reverse = 0;
      while(n!=0){
        int rem = n%10;
        reverse = reverse*10 + rem;
        n/=10;
      }
      System.out.println(reverse);
  }
}
```
---
13. Check whether a number is palindrome or not.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int temp = n;
      int reverse = 0;
      while(n!=0){
        int rem = n%10;
        reverse = reverse*10 + rem;
        n/=10;
      }
      if(temp==reverse)
      System.out.println("Is it palindrome");
      else
      System.out.println("It is not palindrome");
  }
}
```
---
14. Find the frequency of each digit in a given integer.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] freq = new int[10];
      n = Math.abs(n);
      while(n>0){
        int digit = n%10;
        freq[digit]++;
        n/=10;
      }
      for(int i=0;i<10;i++){
        if(freq[i]>0)
        System.out.println(i+":"+freq[i]);
      }
  }
}
```
---
15. If we are getting an input and printing it’s cube .Then we are getting other input from the user such as from input how many number’s cube we need. And print its cube.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int first = input.nextInt();
      int last = input.nextInt();
      int cube=1;
      for(int i=first;i<last;i++){
        cube = (int)Math.pow(i,3);
        System.out.println(cube);
      }
  }
}
```
---
16. Print the GCD of the given 2 numbers.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int first_num = input.nextInt();
      int sec_num = input.nextInt();
      int i=0;
      int gcd=0;
      for( i=1;i<=first_num && i<=sec_num;++i){
        if(first_num%i==0 && sec_num%i==0){
          gcd = i;
        }
      }
      System.out.println(gcd);
  }
}
```
---
17. Print if the given number is odd/even and print their respective range.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int first = input.nextInt();
      for(int i=0;i<=first;i+=2){
        if(first%2==0)
          System.out.println("The range is "+i);
      }
      for(int i=1;i<=first;i+=2){
        if(first%2!=0)
          System.out.println("The range is "+i);
      }
     
  }
}
```
---
18. Find the abundant number it means if given number' divisor's are summed and check if it is greater that the given num. If so then it's a abundant number.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int sum =0;
      for(int i=1;i<=num/2;i++){
        if(num%i==0){
          sum+=i;
        }
      }
      if(num<sum)
     System.out.print("It's abundant num");
     else
     System.out.print("It's not abundant num");
  }
}
```
---
19. Check if the number is Automorphic number or not (25^2 = 625 and 25 comes into the square)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int digit =0;
      int square = num * num;
      int temp = num;
      boolean isAutomorphic = true;
      while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }
        if (isAutomorphic) 
            System.out.println(num + " is an Automorphic number.");
        else 
            System.out.println(num + " is not an Automorphic number.");
        
  }
}
```
---
20. 
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

20. The product of the digits in a given number

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int product = 1;
      while(num!=0){
        int remi = num%10;
        product*=remi;
        num/=10;
      }
      System.out.print(product);
  }
}
```

---

21. Print the digital sum of the number.
    //The digital sum of 1234 is 1 + 2 + 3 + 4 = 10. Since 10 is a two-digit number, you repeat the process: 1 + 0 = 1. So, the digital sum of 1234 is 1.
    The digital sum of 456 is 4 + 5 + 6 = 15. Since 15 is a two-digit number, you repeat the process: 1 + 5 = 6. So, the digital sum of 456 is 6.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Digital sum: " + sum);
    }
}
```

---

22. Print the Narcissistic number.

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev = 0;
        int count = 0;
        int sum =0;
        int temp = num;
        while(temp!=0){
          int rem = temp%10;
          count++;
          temp/=10;
        }
        temp=num;
        while(temp!=0){
         int rem = temp%10;
         sum += (int)Math.pow(rem,count);
         temp/=10;
        }
        System.out.println("result: " + sum);
    }
}
```

---

23. How to find the next 5 palindromes of a given number?

```java
import java.util.*;
public class Main{
  public static boolean isPalindrome(int num){
    int temp = num;
    int rev = 0;
    while(temp!=0){
      int rem = temp%10;
      rev = rev*10 + rem;
      temp/=10;
    }
    return num == rev;
  }
  public static void main(String args[]){
       Scanner input = new Scanner(System.in);
        int num = input.nextInt();
    int count = 0;
    while(count<5){
      num++;
      if(isPalindrome(num)){
        System.out.print(num+" ");
        count++;
      }
    }
  }
}
```

---

24. Swap th first and last digit of a number and print the num after modification.

```java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int last = temp % 10;
        int first = 0;
        int divisor = 1;
        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }
        first = temp;
        int swappedNum = (last * divisor) + (num % divisor - last + first);
        System.out.println("The last and first digit got swapped: " + swappedNum);
        input.close();
    }
}
```

---

25. Find if it is a Perfect Number or not. (The factor of the given number is summed)

```java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int num = input.nextInt();
        for(int i=1;i<=num/2;i++){
          if(num%i==0){
            sum+=i;
          }
        }
        if(sum==num)
        System.out.print("It's perfect number");
        else
        System.out.print("Not a perfect number");
        input.close();
    }
}
```

---

26. Print the prime factor of the number.

```java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=2;i<=num;i++){
          if(num%i==0 && isPrime(i))
          System.out.print(i+" is the prime factor\n");
        }
         input.close();
    }

        public static boolean isPrime(int num) {
          if (num<=1)
          return false;
        for(int i=2;i<=Math.sqrt(num);i++){
          if(num%i==0)
          return false;
        }
        return true;

    }
}
```

---

27. Sum the digits other that first and last digits of the number.

```java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum =0;
        int temp = num;
        int count = 0;
        int first =0;
        int last = num%10;
        while(temp != 0){
          count++;
          int rem = temp%10;
          first = rem;
          sum+=rem;
          temp/=10;
        }
        int first_sum = first+last;
        System.out.print(Math.abs(sum-first_sum));

    }
}
```

---

28. Hollow rectangle

```
******
*    *
*    *
*    *
******
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        for(int i=1;i<=row;i++){
          for(int j=1;j<=col;j++){
            if(i==1 || j==1 || i==row || j==col ){
              System.out.print("*");
            }
            else
              System.out.print(" ");
        }
        System.out.println();
}
    }
}
```

---

29. Hollow square

```
*****
*   *
*   *
*   *
*****
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for(int i=1;i<=row;i++){
          for(int j=1;j<=row;j++){
            if(i==1 || j==1 || i==row || j==row ){
              System.out.print("*");
            }
            else
              System.out.print(" ");
        }
        System.out.println();
}
    }
}
```

---

30. To print the first and last digit of a number.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
      int count = 0;
      int temp = num;
      int last = temp%10;
      int first = 0;
      temp=num;
      while(temp!=0){
        first = temp%10;
        temp/=10;
      }
      System.out.print(first+" and "+last);
    }
}
```

---

31. Find the LCM and GCD.

```java
import java.util.Scanner;
public class Main {
  public static int GCDcheck(int num1,int num2){
    while(num2!=0){
      int temp = num2;
      num2 = num1%num2;
      num1 = temp;
    }
    return num1;
  }
  public static int LCMckeck(int num1,int num2){
    return (num1*num2)/GCDcheck(num1,num2);
  }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = LCMckeck(num1,num2);
        int gcd = GCDcheck(num1,num2);
        System.out.print(lcm+" is lcm and gcd is "+gcd);
        }
    }
```

---

32. To check if the given year is leap year or not

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int year = inp.nextInt();
    if((year%4==0 && year%100 != 0)||(year%400==0))
    {
      System.out.print(year+" is a leap year");
    }
  }
}
```

---

33. Printing the next 10 leap year from the gien year.

```java
import java.util.*;

public class Main {
    public static Boolean IsLeapyear(int year) {

    if((year%4==0 && year%100 != 0)||(year%400==0))
    return true;
    else
    return false;
  }
  public static void main(String[] args){
      Scanner inp = new Scanner(System.in);
      int year = inp.nextInt();
      int count=0;
      int start = year+1;
      while(count<10){
        if(IsLeapyear(start)){
        count++;
        System.out.print(start+" ");
        }
        start++;
      }
}
}
```

---

34. Increment the digit of the number by one and print the answer.

```java
import java.util.*;
public class main{
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
      int result = 0;
      int placeValue = 1;
      int digit=0;
      while(num!=0){
        digit = num%10;
        digit = (digit+1)%10;
        result = result + (digit*placeValue);
        placeValue *= 10;
        num/=10;
      }
      System.out.print(result);
}
}
```

---

35. To check if the given number is harshad number or not. Ex: 156 --> 1+5+6 = 12 and 156 is divisible by 12 so it's harshad's number.

```java
import java.util.*;
public class main{
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
      int sum = 0;
      int temp = num;
      while(temp!=0){
        int rem = temp%10;
        sum += rem;
        temp/=10;
      }
      if(num%sum==0)
      System.out.print("It's harshad number");
      else
      System.out.print("Not harshad number");
}
}
```

---

36. The fibonacci series

```java
import java.util.Scanner;
public class Main {
  public static int Fibonacci(int num1){
    if(num1<=1)
    return num1;
    return Fibonacci(num1-1)+Fibonacci(num1-2);
  }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

       for(int i=0;i<num1;i++){
         System.out.print(Fibonacci(i)+" ");
       }
        }
    }

```

---

37. To find the sum , series and the nth term in fibonacci series.

```java
   import java.util.Scanner;
   public class Main {
   public static int Fibonacci(int num1){
    if(num1<=1)
    return num1;
    return Fibonacci(num1-1)+Fibonacci(num1-2);
  }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int nums = 0;
        int sum = 0;
        int nthterm =0;
       for(int i=0;i<num1;i++){
         nums = Fibonacci(i);
         System.out.print(Fibonacci(i)+" ");
         sum+=nums;
         if(i==num1-1)
         nthterm = nums ;
       }
       System.out.print("the sum is "+sum+" and the nth term is "+nthterm);
        }
    }
 ```
 ---
 38. Swap the first and last digit of the number.

  ```java
   import java.util.*;
   public class main{
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
      String numStr = Integer.toString(num);
      int len = numStr.length();
      char first = numStr.charAt(0);
      char last = numStr.charAt(len-1);
      if(len<2){
        System.out.print(num);
        return;
      }
      String swapNum = last + numStr.substring(1,len-1)+first;
      int swappedNum = Integer.parseInt(swapNum);
      System.out.print(swappedNum);
   }
   }

```
---

39. To find if the gvn num is strong number or not.
 ex: 145 is strong as 1!+4!+5! = 145.

 ```java
 import java.util.*;
 public class main{
  public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact*=i;
    }
    return fact;
  }
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
      int temp = num;
      int sum =0;
      while(temp!=0){
        int rem = temp%10;
        sum+=factorial(rem);
        temp/=10;
      }
      if(num==sum)
      System.out.print("true");
      else 
      System.out.print("False");
}
}

```
---
40. To check whether the number is Prime number or not.

```java
import java.util.*;
public class main{
  public static boolean isPrime(int n){
    if(n<=1)
    return false;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0)
      return false;
    }
    return true;
  }
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int num = inp.nextInt();
     
      if(isPrime(num))
      System.out.print("true");
      else 
      System.out.print("False");
      
}
}
```
---
41. If the leap years and non-leap years in next 10 yrs.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year > 0) {
            System.out.print("Leap years: ");
            for (int i = year + 1; i <= year + 10; i++) {
                if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            System.out.print("Non-leap years: ");
           for (int j = year + 1; j <= year + 10; j++) {
                if (!((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        } else {
            System.out.print("Invalid year");
        }
    }
}
```
---
42. 

1. Getting string after number

```java
import java.util.*;
public class getting_inp {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     double weight = inp.nextDouble();
     inp.nextLine();
     String name = inp.nextLine();
     System.out.println(name+weight );
  }
}
```
---
2. Getting character input

```java
import java.util.*;
public class getting_inp {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     char ch = inp.next().charAt(0);
     System.out.println(ch);
  }
}
```
---
3. Calculating the average of 3 numbers

```java
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    int num1=inp.nextInt();
    int num2=inp.nextInt();
    int num3=inp.nextInt();
    double avg = 0;
    int sum = num1+num2+num3;
    avg = (double)sum/3;
    System.out.printf("%.2f",avg);
  }
}
```
---
4. To generate a random input within a given range

```java
import java.util.*;
public class Main{
  public static void main(String[] args){
    Random random = new Random();
    Scanner inp = new Scanner(System.in);
    double num1=inp.nextDouble();
    double num2=inp.nextDouble();
    double max = Math.max(num1,num2);
    double min = Math.min(num1,num2);
    double random_num = random.nextDouble();
    double range = min+(max-min)*random_num;
    System.out.printf("%.2f",range);
  }
}
```
---
5. If we are declaring a float , double input 

```java
public class Main {
  public static void main(String[] args) {
    float f1 = 35e3f;
    double d1 = 12E5d;
    System.out.println(f1);
    System.out.println(d1);  
  }
}
```
In this float e3 --> aftr 35000.0
In this double E3 --> aftr 1200000.0

---
6. 

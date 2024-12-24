1. Area of circle
```java
package java.util.Scanner;
public class Area_finding {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      double radius = inp.nextDouble();
      double area = 0;
      area=Math.PI * Math.pow(radius,2);
      System.out.printf("%.2f",area);
  }
}
```
---
2. Area of rectangle

```java
import java.util.*;
public class Area_finding {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      double l = inp.nextDouble();
      double b = inp.nextDouble();
      double area=l*b;
      System.out.printf("%.2f",area);
  }
}
```
3. Area of square

```java
import java.util.*;
public class Area_finding {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      double a = inp.nextDouble();
      
      double area= Math.pow(a,2);
      System.out.printf("%.2f",area);
  }
}
```
4. 
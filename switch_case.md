1. Calculator using switch

```java
import java.util.*;
public class getting_inp {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
     double num1= inp.nextDouble();
     double num2 = inp.nextDouble();
     int expression = inp.nextInt();
     
     switch(expression){
       case 1:
         System.out.println(num1+num2);
         break;
       case 2:
         System.out.println(Math.abs(num1-num2));
         break;
       case 3:
         System.out.println(num1*num2);
         break;
        case 4:
          if(num2!=0)
         System.out.println(num1/num2);
         else
         System.out.println("Division by 0 isn't allowed");
         break;
         default:
         System.out.println("Invalid operation");
     }
  }
}
```
---
2. 
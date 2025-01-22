### Java Math problems

1. Integer to roman

```java
public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {  
                num -= values[i];        
                roman.append(symbols[i]); 
            }
        }
        return roman.toString();
    }
}
```
- In this we are using `StringBuilder` instead of geting input via `Scanner.getInput` as string is `immutable` so, everytime we append a string a new memory will be created and that will lead to high consumption of memory , so to avoid that we are using `StringBuilt` as it's mutable.

---
###### Note - `Integer.MIN_VALUE` is -2^31 and `Integer.MAX_VALUE` is 2^31 - 1.
---

2. 
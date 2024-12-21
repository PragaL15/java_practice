### Basic math hints

1. 
```
if (dividend == Integer.MIN_VALUE && divisor == -1) {
    return Integer.MAX_VALUE;
}
```
This is used when dividing `Integer.MIN_VALUE (-2^31) by -1`, the result is 2^31, which exceeds the range of a 32-bit integer ([-2^31, 2^31 - 1]). To handle this edge case, the result is capped at `Integer.MAX_VALUE`.

- If this is used then use the datatype as `long`

##### Using the XOR 

1. `XOR` will return true when their signs differ, the XOR evaluates to true.
 ex:  dividend = -10, divisor = 3: (true ^ false) = true 
      dividend = -10, divisor = -3: (true ^ true) = false 
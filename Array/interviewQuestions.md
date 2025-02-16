## Interview Questions

1. What is an array in Java?

- An array in Java is a collection of elements of the same data type stored in contiguous memory locations. It provides a way to store multiple values in a single variable.

2. How do you declare and initialize an array in Java?

```Java

int[] numbers;  
int numbers[];  
numbers = new int[5]; 
int[] values = {10, 20, 30, 40, 50};
```
3. What is the default value of array elements in Java?
- Numeric types `(int, double, float, etc.)` → `0`
- boolean → `false`
- char → `\u0000` (null character)
- Object references `(String, Integer, etc.)` → null

4. What is the difference between an array and an ArrayList?

| Feature         | **Array** | **ArrayList** |
|----------------|----------|--------------|
| **Size** | Fixed size (defined at creation) | Dynamic size (resizable) |
| **Type** | Can hold both primitive types (`int`, `char`, etc.) and objects | Can only hold objects (e.g., `Integer`, `String`, etc.) |
| **Performance** | Faster because it doesn’t have overhead for resizing | Slower due to dynamic resizing and additional features |
| **Resizing** | Cannot be resized once created | Automatically resizes (internally uses an array and increases size when needed) |
| **Memory Usage** | Uses less memory since there is no extra overhead | Uses more memory due to resizing logic and wrapper objects |
| **Element Insertion** | Requires manual shifting of elements | `add()` handles shifting automatically |
| **Methods Available** | Only basic operations like getting and setting elements | Many built-in methods (`add()`, `remove()`, `contains()`, etc.) |
| **Type Safety** | Can store both primitives and objects | Supports generics, ensuring type safety |
| **Usage Case** | When working with a fixed number of elements | When needing a dynamically changing collection |

### **Example Code:**
#### **Array Example**
```java
int[] numbers = new int[5];  
numbers[0] = 10;
numbers[1] = 20;
System.out.println(numbers[0]); 
```

##### **ArrayList Example**
```java
import java.util.ArrayList;

ArrayList<Integer> numbersList = new ArrayList<>(); 
numbersList.add(10);
numbersList.add(20);
System.out.println(numbersList.get(0)); 
```
5. 
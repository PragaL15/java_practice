### Mostly used in problems

- `Arrays.sort(arr_name);` - to sort the array
---
##### HashSet

- A HashSet is a collection that is commonly used in scenarios where you need to store unique elements and perform fast operations like searching, adding, or removing elements.
- HashSet has constant-time complexity (O(1)).
-A HashSet in Java cannot be directly sorted because it is an implementation of the Set interface that does not maintain any order of elements. If we want to sort the HashSet we need to convert them into list or treeset.

###### Mostly used cases
1. Finding Duplicates in Data - As they store only unique elements.
2. Removing Duplicates 
3.  Checking Membership - check if an element exists in a collection.
4. Union, Intersection, and Difference of Sets ,
 ex;
 ```java
 HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

// Union
set1.addAll(set2); // set1 = [1, 2, 3, 4]

// Intersection
set1.retainAll(set2); // set1 = [2, 3]

// Difference
set1.removeAll(set2); // set1 = [1]
```
5. Finding Pair Sums

---
##### List 
- A list is a fundamental data structure in programming, commonly used to store and manage an ordered collection of items. Lists are particularly useful in solving problems that involve dynamic collections of elements or require sequential access. 

###### Mostly used cases 
1. Dynamic Size and Order Maintenance - When the number of elements is unknown at the start or may change dynamically.
**Mostly used when we are tracking something like a shopping cart , managing users.**
2. Sequential Access - When you need to iterate over elements in a specific order like traversing,iterating.
3. Collection of Related Data - to group similar types of data into a single structure.
4. Search and Filtering 
5. Temporary Data Storage - Lists are helpful for storing intermediate results or temporary collections.

###### List vs Array

1. List - Automatically grows or srink when elements are added or removed.
Arrays - We've to give the fixed size at time of creation.

2. In List - built-in Methods are more compared to that of array.

3. Type safety in List is goood compare to arrays as they **Lack the convenience of generics**

4. Memory management is **Dynamically allocating , de-allocating in list** but in Arrays the upfront memory is used which could lead to memory wastage sometimes.

---

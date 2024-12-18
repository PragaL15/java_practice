import java.util.*;

public class Last_duplicate {
  public static void main(String[] args) {
    int[] arr = {1, 5, 6, 7};
    Set<Integer> seen = new HashSet<>();
    int lastDuplicate = -1; // Default value if no duplicate is found

    // Traverse the array in reverse to find the last duplicate
    for (int i = arr.length - 1; i >= 0; i--) {
      if (seen.contains(arr[i])) {
        lastDuplicate = arr[i];
        break; // Exit loop as we found the last duplicate
      }
      seen.add(arr[i]);
    }

    // Print the last duplicate or indicate if no duplicate exists
    if (lastDuplicate != -1) {
      System.out.println("Last Duplicate: " + lastDuplicate);
    } else {
      System.out.println("No duplicates found");
    }
  }
}

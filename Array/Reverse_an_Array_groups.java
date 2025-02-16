import java.util.*;
public class Reverse_an_Array_groups {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        for (int i = 0; i < arr.length; i += k) { // Increment `i` by `k`
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1); // Last index of the sub-array
            int temp;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



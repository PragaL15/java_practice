//Here we use hashset as it stores only unique elements and we are using two pointer approach
//as the k was tracking where the nxt unique element should get placed

import java.util.*;
public class remove_duplicate_hashmap {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int k=0;
      HashSet<Integer> set = new HashSet<>();
      int[] arr = new int[num];
      for(int i=0;i<num;i++){
        arr[i] = input.nextInt();
      }
      for(int i=0;i<num;i++){
        if(!set.contains(arr[i])){
        set.add(arr[i]);
        arr[k++] = arr[i];
      }
  }
      for(int i=0;i<k;i++){
      System.out.print(arr[i]);
      if(i!=k-1){
        System.out.print(" ");
      }
  }
}
}
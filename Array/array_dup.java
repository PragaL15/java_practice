import java.util.*;
 class Array_dup {
  public List<Integer> findDuplicates(int[] arr) {
      HashSet<Integer> seen = new HashSet<>();
      HashSet<Integer> dup = new HashSet<>();
      for(int num:arr){
          if(!seen.add(num)){
              dup.add(num);
          }
      }
      List<Integer> list = new ArrayList<>(dup);
      list.sort(null);
      return list;
  }
 }

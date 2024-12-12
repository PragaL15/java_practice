// Program to find the minimum (or maximum) element of an array
import java.util.*;
public class min_element {
  public static void main(String[] args){
    int[] arr = {-10, -20, -30, -40};
    int len = arr.length;
    int min = arr[0];
    for(int i = 0; i < len; i++){
      if(min>arr[i]){
     min = arr[i];
  }
}
System.out.print(min);
}
}

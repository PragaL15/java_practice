import java.util.*;
public class max_consecutive {
    public static void main(String[] args) {
     int maxCount=0 , count=0 ,prev = -1;
     List <Integer> num = List.of(1,2,0,1,1,1,1,0,0);
     for(int n:num){
       if((prev^n)==0){
         count++;
       }
       else {
         maxCount=Math.max(maxCount,count);
         count=1;
       }
       prev = n;
     }
     System.out.print(maxCount);
  }
}


import java.util.*;
public class transpose {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int[][] arr1 = new int[row][row]; 
      for(int i=0;i<row;i++){
        for(int j=0;j<row;j++){
          arr1[i][j]=input.nextInt();
       }
     }
      for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         System.out.print(arr1[j][i]+" ");
       }
         System.out.println();
     }
  }
}


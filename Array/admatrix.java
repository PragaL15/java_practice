import java.util.*;
public class admatrix {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int[][] arr1 = new int[row][row]; 
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr1[i][j]=input.nextInt();
       }
     }
      int[][] arr2 = new int[row][row]; 
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         arr2[i][j]=input.nextInt();
       }
     }
     int[][] sum =new int[row][row];
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         sum[i][j] = arr1[i][j] + arr2[i][j];
       }
     }
System.out.print(Arrays.deepToString(sum));
  }
}
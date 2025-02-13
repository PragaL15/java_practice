import java.util.Scanner;

public class equal_matrix {
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
     int equal =0;
     for(int i=0;i<row;i++){
       for(int j=0;j<row;j++){
         if(arr1[i][j] != arr2[i][j])
         equal = 1;
       }
     }
     if(equal ==1)
     System.out.print("false");
     else
     System.out.print("true");
  }
}

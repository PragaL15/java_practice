//A jagged array is a 2D array where each row can have a different number of columns.
public class array_obj {
  public static void main(String[] args) {
    int[][] arr = {
      {
        1,2,3
      },{
        4,6
      } , {
        7,8,9
      }
    };
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
}
}

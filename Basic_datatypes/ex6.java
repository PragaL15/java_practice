import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class ex6 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    DecimalFormat d = new DecimalFormat("0.00"); //to biring the 2 decimal places aftr answer
    System.out.print(d.format(Math.pow(num1,num2)));
    scanner.close();
  }
}
